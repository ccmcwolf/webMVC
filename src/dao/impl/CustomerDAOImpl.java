package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import bo.Customer;
import dao.CustomerDAO;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public int add(Customer c, Connection con)  throws SQLException  {
		PreparedStatement prdStm = con.prepareStatement("INSERT INTO customer (id,name,address) VALUES(?,?,?)");
		prdStm.setString(1, c.getCustID());
		prdStm.setString(2, c.getCustName());
		prdStm.setString(3, c.getCustAddress());
		int res = prdStm.executeUpdate();
		return res;
	}

	@Override
	public int edit(Customer c, Connection con)  throws SQLException  {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer get(Customer c, Connection con)  throws SQLException  {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAll(Connection con)  throws SQLException  {
		// TODO Auto-generated method stub
		return null;
	}

}
