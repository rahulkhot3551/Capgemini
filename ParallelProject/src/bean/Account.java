package bean;

enum accType{
	SAVINGS,CURRENT;
}

public class Account {

	private static int acc_no=1000;
	private accType type;
	private double acc_balance;
	
	
	public Account() {
		super();
		//acc_no++;
		
	}


	public Account(String type, double acc_balance) {
		super();
		acc_no++;
		this.type=accType.valueOf(type);
		
		this.acc_balance = acc_balance;
	}


	public String getType() {
		String str=type.name();
		return str;
	}


	public void setType(accType type) {
		this.type = type;
	}


	public double getAcc_balance() {
		return acc_balance;
	}


	public static void setAcc_no(int acc_no) {
		Account.acc_no = acc_no;
	}


	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}


	public int getAcc_no() {
		return acc_no;
	}



	@Override
	public String toString() {
		return "Account [acc_no=" + acc_no + ", type=" + type + ", acc_balance=" + acc_balance + "]";
	}
	

	
}


