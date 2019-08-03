package service;

import bean.Customer;
import dao.DaoAccountClass;

public class ServiceAccClass implements ServiceAccIntf {
	
	DaoAccountClass dac=new DaoAccountClass();
	@Override
	public Customer getDetails(int num) {
					
		return dac.getDetails(num);
	}

	@Override
	public void storeDetails(Customer c) {
		
		dac.storeDetails(c);
		
	}

	@Override
	public Customer updateDetails(int ac_no, double amtDeposit) {
		
	return dac.updateAccount(ac_no, amtDeposit); 
	}

	@Override
	public Customer withdraw(int ac_no, double withdraw) {
		return dac.withdraw(ac_no, withdraw);

	}

	@Override
	public void fundTransfer(int acc1, int acc2, double amt) {
		dac.fundTransfer(acc1, acc2, amt);
		
	}

	
}
