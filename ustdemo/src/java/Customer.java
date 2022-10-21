
public class Customer {
	
	
	private int customerId;
	private String customerName;
	private String emailId;
	
	
	
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerid) {
		this.customerId = customerid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailid(String emailid) {
		this.emailId = emailid;
	}

	public Customer(int customerid, String customername, String emailid) {
		
		
		   super();
		   this.customerId = customerid;
		   this.customerName = customername;
		   this.emailId = emailid;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}