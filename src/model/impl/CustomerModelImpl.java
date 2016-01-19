package model.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import dao.impl.CustomerDAOImpl;
import bo.Customer;
import model.CustomerModel;

public class CustomerModelImpl extends CustomerModel {

	public CustomerModelImpl(DataSource ds) {
		super(ds);
	}

	@Override
	public int addCustomer(Customer c) throws SQLException {
		Connection conn = ds.getConnection();
		conn.setAutoCommit(false);

		int res = 0;
		try {
			setCustomerDAO(new CustomerDAOImpl());
			res = customerDAO.add(c, conn);

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
	public int editCustomer(Customer c) throws SQLException {

		return 0;
	}

	@Override
	public int deleteCustomer(Customer c) throws SQLException {

		return 0;
	}

	@Override
	public Customer searchCustomer(Customer c) throws SQLException {

		return null;
	}

	@Override
	public List<Customer> getCustomers() throws SQLException {

		return null;
	}

}
