package dao;

import java.util.*;

import ui.UserInterface;
import bean.Account;
import bean.Customer;

public class DaoAccountClass implements DaoAccountIntf{

	static Map< Integer, Customer > m=new HashMap< Integer, Customer >();
	//List<Customer> ListForCustomer=new ArrayList<Customer>();
	// DaoAccountClass dao = new DaoAccountClass();
	@Override
	public Customer getDetails(int num) {
		
	//	Set<Integer> s=m.keySet();
		//Iterator<Integer> i=s.iterator();
	
					//Customer c=new Customer();
		
					//System.out.println(c.getAddress());
					//System.out.println(c.getAcct().getAcc_no());
		
			
			//System.out.println(s);
		//}
		//System.out.println(m.keySet().);
		
		//m.forEach((key, value) -> System.out.println(key + ":" + value));
	
		if(m.containsKey(num)){
			//m.get(m).getAcct();
			Account.setAcc_no(num);
			return	m.get(num);
		

		}
		return null;
			
		//System.out.println(num+"  "+m.get().getAcct().getAcc_no());		
		//return	m.get(num);
		
		//	System.out.println(ListForCustomer.get(i));
		
		
			
	}

	@Override
	public void storeDetails(Customer c) {
				
		//ListForCustomer.add(c);
	//	System.out.println(ListForCustomer.get(c.getAcct().getAcc_no()));
		//System.out.println(ListForCustomer.size());
		m.put(c.getAcct().getAcc_no(),  c);
		//System.out.println();
	//	System.out.println(m.get(c.getAcct().getAcc_no()));
		//System.out.println(m.keySet().toString());
		
		//System.out.println(m.get(1001).getAcct().getAcc_no());

		//System.out.println(m.get(1002).getAcct().getAcc_no());

		//System.out.println(m.get(1003).getAcct().getAcc_no());
		
	}

	@Override
	public Customer updateAccount(int ac_no, double amtDeposit) {
		Customer temp =  (m.get(ac_no));
		double tmp=temp.getAcct().getAcc_balance() + amtDeposit;
		
		temp.getAcct().setAcc_balance(tmp);  
		return temp;
	}

	@Override
	public Customer withdraw(int ac_no, double withdraw) {
		Customer temp = m.get(ac_no);
		double tmp = temp.getAcct().getAcc_balance() - withdraw ;
		temp.getAcct().setAcc_balance(tmp);
		return temp;
	}

	@Override
	public void fundTransfer(int acc1, int acc2, double amt) {
		Customer temp = m.get(acc1);
		
		temp.getAcct().setAcc_balance(temp.getAcct().getAcc_balance()-amt);

		//System.out.println((temp.getAcct().getAcc_balance()));

		Customer temp1 = m.get(acc2);
		
		temp1.getAcct().setAcc_balance(temp1.getAcct().getAcc_balance()+amt);

		//System.out.println((temp1.getAcct().getAcc_balance()));
		
	}
	
	
}
