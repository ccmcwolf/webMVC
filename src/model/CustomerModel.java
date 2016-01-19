package model;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import dao.CustomerDAO;
import bo.Customer;

public abstract class CustomerModel {
	
	protected CustomerDAO customerDAO;
	
	protected DataSource ds;
	
	protected CustomerModel(DataSource ds) {
		this.ds = ds;
	}
	
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}
	
	public abstract int addCustomer(Customer c)  throws SQLException ;
	public abstract int editCustomer(Customer c)  throws SQLException ;
	public abstract int deleteCustomer(Customer c)  throws SQLException ;
	public abstract Customer searchCustomer(Customer c)  throws SQLException ;
	public abstract List<Customer> getCustomers()  throws SQLException ;
}
