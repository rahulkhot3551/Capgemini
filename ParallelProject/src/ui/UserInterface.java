package ui;

import java.util.Scanner;

import bean.Account;
import bean.Customer;
import dao.DaoAccountClass;
import service.ServiceAccClass;

public class UserInterface {
	static ServiceAccClass sac=new ServiceAccClass();

	static  Scanner sc=new Scanner(System.in);
    static Customer c = new Customer();
	public static void main(String args[]){
		
		
		
		char y;

		do{
			System.out.println("MENU\n1.CREATE ACCOUNT\n2.SHOW BALANCE\n3.DEPOSIT\n4.WITHDRAW\n5.FUND TRANSFER\n6.PRINT TRANSACTION\n7.EXIT");
			int ch=sc.nextInt();
		switch(ch){
		
		case 1:
				createAccount();
				break;
		case 2:
				showBalance();
				break;
				
		case 3:
				deposit();
				break;
		case 4:
				withdraw();
				break;
				
		case 5:
				fundTransfer();
				break;
		case 6:
				break;
		case 7:	
				System.exit(0);
				break;
		default:	
				System.out.println("Wrong choice ... Try again");
		}
		System.out.println("Do you want to continue? Y/N?");
		y=sc.next().charAt(0);
		}while(y!='N');
	}
	
	private static void fundTransfer() {
		System.out.println("Enter Account number from which the money is to be transferred");
		int acc1 = sc.nextInt();
		System.out.println("Enter the Account number to which the money needs to be transferred");
		int acc2 = sc.nextInt();
		System.out.println("ENter the Amount to be transferred");
		double amt = sc.nextDouble();
		if( sac.getDetails(acc1).getAcct().getType().equals("SAVINGS")){
		if(sac.getDetails(acc1).getAcct().getAcc_balance()-1000>amt ){
			
		sac.fundTransfer(acc1, acc2, amt);

		System.out.println("Acount No: "+acc1+" balance:"+sac.getDetails(acc1).getAcct().getAcc_balance());
		System.out.println("Acount No: "+acc2+" balance:"+sac.getDetails(acc2).getAcct().getAcc_balance());

		}
		else
			System.out.println("Minimum balance should be 1000");
		}
		else
		{
			if(sac.getDetails(acc1).getAcct().getAcc_balance()>amt)
				sac.fundTransfer(acc1, acc2, amt);
			else
				System.out.println("less balance cannot transfer");

			
		}
		//c=sac.getDetails(acc1);
		//System.out.println(sac.getDetails(acc1).getAcct().getAcc_no());
		//Customer c2=new Customer();
		
		//System.out.println(sac.getDetails(acc2).getAcct().getAcc_no());
		//Customer c=new Customer();
	//	c =sac.getDetails(acc1);
		//System.out.println(c);
		//Customer c1=new Customer();
		//c1 =sac.getDetails(acc2);
		//System.out.println(c1);
	}

	private static void deposit() {
		
		System.out.println("Enter the account number");
		int ac_no = sc.nextInt();
		System.out.println("Enter amount you want to deposit greater than 100");
		double  deposit = sc.nextDouble();
		if(deposit>=100){
		c = sac.updateDetails(ac_no, deposit);
		
		System.out.println(c.getAcct().getAcc_no()+" has balance " + c.getAcct().getAcc_balance());
		
		}else{
			System.out.println("Less amount to deposit:: Cannot deposit:: Try Again");
			return;
		}
		}
private static void withdraw() {
		
		System.out.println("Enter the account number");
		int ac_no = sc.nextInt();
		System.out.println("Enter amount you want to withdraw");
		double  withdraw = sc.nextDouble();
		if(sac.getDetails(ac_no).getAcct().getType().equals("SAVINGS")){
		if(withdraw <(sac.getDetails(ac_no).getAcct().getAcc_balance()-1000))
		{
			c = sac.withdraw(ac_no, withdraw);	
		System.out.println(c.getAcct().getAcc_no()+" has balance " + c.getAcct().getAcc_balance());
		}
		else
		{
			System.out.println("Less Balance to Withdraw");
		}
		
		}

		else
		{
			c = sac.withdraw(ac_no, withdraw);	
			System.out.println(c.getAcct().getAcc_no()+" has balance " + c.getAcct().getAcc_balance());
		}
}		


	private static void showBalance() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account number to show details");
		int acc=sc.nextInt();
		Customer c=new Customer();
		c=sac.getDetails(acc);
		System.out.println(c);
		//System.out.println(sac.getDetails(acc));
		
	}

	static void createAccount(){
		System.out.println("Enter your Details");
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		String nm=sc.nextLine();
		System.out.println("Enter your address");
		String adr=sc.nextLine();
		System.out.println("Enter your phone number");
		String phone=sc.next();
		System.out.println("Account Type: SAVINGS OR CURRENT");
		String type=sc.next().toUpperCase();
		double bln=0;
		if(type.equals("SAVINGS"))
		{
			System.out.println("Enter the amount you want to deposit...(>1000)");
			
			bln=sc.nextDouble();
		if(bln<1000){
				System.out.println("Minimum balance low\nCannnot create Account");
				return ;
		}
		}
		else{
		System.out.println("Enter amount to deposit  ");
		bln=sc.nextDouble();
		}
		int i=0;
		
		Account act=new Account(type,bln);
		Customer ct=new Customer(nm,adr,phone,act);
		//System.out.println(ct);
		
		
		sac.storeDetails(ct);
		
	

	
		}
	}
	


