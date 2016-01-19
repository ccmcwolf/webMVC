package model.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import bo.Item;
import dao.impl.ItemDAOImpl;
import model.ItemModel;

public class ItemModelImpl extends ItemModel {

	public ItemModelImpl(DataSource ds) {
		super(ds);
	}

	@Override
	public int addItem(Item item) throws SQLException {
		Connection conn = ds.getConnection();
		conn.setAutoCommit(false);
		
		int res = 0;
		try {
			setItemDAO(new ItemDAOImpl());
			res = itemDAO.add(item, conn);
			if (res != 0) {
				conn.commit();
			} else {
				throw new SQLException();
			}
		} catch (SQLException ex) {
			conn.rollback();
			throw new SQLException(ex);
		} catch (Exception ex) {
			conn.rollback();
			throw new SQLException(ex);
		} finally {
			conn.close();
		}
		return res;
	}

	@Override
	public int editItem(Item item) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteItem(Item item) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Item searchItem(Item item) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> getItems() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
