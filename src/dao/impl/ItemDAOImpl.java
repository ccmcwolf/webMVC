package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import bo.Item;
import dao.ItemDAO;

public class ItemDAOImpl implements ItemDAO{

	@Override
	public int add(Item item, Connection conn) throws SQLException {
		PreparedStatement prdStm = conn.prepareStatement("INSERT INTO item (code,description,unitPrice,qtyOnHand) VALUES(?,?,?,?)");
		prdStm.setString(1, item.getCode());
		prdStm.setString(2, item.getDescription());
		prdStm.setObject(3, item.getUnitPrice());
		prdStm.setObject(4, item.getQtyOnHand());
		int res = prdStm.executeUpdate();
		return res;
	}

	@Override
	public int edit(Item item, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Item get(Item item, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> getAll(Connection con) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
