package bean;

public class Customer {
	private String name;
	private String address;
	private String phone;
	Account acct;
	
	public Customer() {
		super();
	}

	public Customer(String name, String address, String phone, Account acct) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.acct = acct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	public Account getAcct() {
		return acct;
	}

	public void setAcct(Account acct) {
		this.acct = acct;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", phone=" + phone + ", acct=" + acct + "]";
	}


	
}
