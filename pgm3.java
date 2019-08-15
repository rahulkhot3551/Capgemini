package ui;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


/**
 * 
 * @author spavanku
 * 
 * take the HashMap as a first input which contains employee name as a key and his/her organization as a value. 
 * and organization name of string type as a second input.
 * 
 * store all the employee names in List when the second input is matching with the value of the the HashMap.
 * 
 *  sample Input 1:
 *  =============
 *  How many employees you want to add?
 *  4
 *  add 4 Employees
 *  pavan
 *  capgemini
 *  kumar
 *  cts
 *  selvi
 *  ibm
 *  ravi
 *  capgemini
 *  
 *  Enter organization name
 *  capgemini
 *  
 *  Sample output 1:
 *  ==============
 *  pavan
 *  ravi
 * 
 * Note:
 * =====
 *  * if No employees present with the given org name print "No employees present with the given organization name"
 * 
 * 	sample Input 2:
 *  ===============
 *  How many employees you want to add?
 *  3
 *  add 3 Employees
 *  pavan
 *  capgemini
 *  kumar
 *  cts
 *  selvi
 *  ibm
 *    
 *  Enter organization name
 *  tcs
 *  
 *  Sample output 2:
 *  ==============
 *  No employees present with the given organization name
 */

public class pgm3 {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("How many employees you want to add?");
	int n=sc.nextInt();
	HashMap<String,String> hm=new HashMap<String, String>(n);
	System.out.println("Add "+n+" Employees");
	
	for(int i=0;i<n;i++)
	{
		String emp=sc.next();
		String org=sc.next();
		hm.put(emp, org);				
	}
	System.out.println("Enter Organization name");
	String str2=sc.next();
	
	if(getEmployeeNames(hm,str2).size()==0)
			System.out.println("No employees with given organization");		
	else
	getEmployeeNames(hm,str2).stream().iterator().forEachRemaining(System.out::println);;
				
	}

	public static List<String> getEmployeeNames(HashMap<String, String> employeesList,String organization) {
		
	List<String> l=new ArrayList<String>();
	
	
	for(Map.Entry<String ,String> m:employeesList.entrySet())
	{
		if(m.getValue().equals(organization))
			l.add(m.getKey());
	
		
	}
		
	
		return l;

	}

}
