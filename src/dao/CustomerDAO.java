package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import bo.Customer;

public interface CustomerDAO {
	int add(Customer c, Connection conn)  throws SQLException ;
	int edit(Customer c, Connection con)  throws SQLException ;
	Customer get(Customer c, Connection con)  throws SQLException ;
	List<Customer> getAll(Connection con)  throws SQLException ;
}
