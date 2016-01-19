package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import bo.Customer;
import bo.Item;

public interface ItemDAO {
	int add(Item item, Connection conn)  throws SQLException ;
	int edit(Item item, Connection con)  throws SQLException ;
	Item get(Item item, Connection con)  throws SQLException ;
	List<Item> getAll(Connection con)  throws SQLException ;
}
