package bo;

public class Customer {
	private String custID;
	private String custName;
	private String custAddress;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String custID, String custName, String custAddress) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.custAddress = custAddress;
	}



	public String getCustID() {
		return custID;
	}
	public void setCustID(String custID) {
		this.custID = custID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	
	
}
