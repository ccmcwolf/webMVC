package model;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import dao.ItemDAO;
import bo.Item;
import bo.Item;

public abstract class ItemModel {
	
	protected ItemDAO itemDAO;
	
	protected DataSource ds;
	
	protected ItemModel(DataSource ds) {
		this.ds = ds;
	}
	
	public void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}
	
	public abstract int addItem(Item item)  throws SQLException ;
	public abstract int editItem(Item item)  throws SQLException ;
	public abstract int deleteItem(Item item)  throws SQLException ;
	public abstract Item searchItem(Item item)  throws SQLException ;
	public abstract List<Item> getItems()  throws SQLException ;
}
