package service;

import bean.Customer;

public interface ServiceAccIntf {
	
	Customer getDetails(int num);
	void storeDetails(Customer c);
	Customer updateDetails(int ac_no , double amtDeposit);
	Customer withdraw(int ac_no , double withdraw);
	void fundTransfer(int acc1, int acc2 , double amt);
}
