package dao;

import bean.Account;
import bean.Customer;

public interface DaoAccountIntf {
	
		Customer getDetails(int num);
		void storeDetails(Customer c);
		Customer updateAccount(int ac_no , double amtDeposit);
		Customer withdraw(int ac_no , double withdraw);
		void fundTransfer(int acc1 , int acc2 , double amt);

}
