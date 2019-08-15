package ui;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * 
 * @author spavanku
 *
 *	take List of Strings as input, and return the string which is having max length as an output.
 *
 *	Input1:
 *	======
 *	How many names you want to add:
 *	4
 *	pavan
 *	kumar
 *	siva
 *	sudheer
 *
 * Output1:
 * ========
 * sudheer
 *
 */

public class Main {


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("How many names you want to add:");
	
		int n=sc.nextInt();
		 List<String> l=new ArrayList<String>(n);
			
		for(int i=0;i<n;i++)
			l.add(sc.next());
		

		String ans=getnames(l);
	System.out.println(ans);
	sc.close();
	}

	public static String getnames(List<String> names) {
		
		 int count=0,m=0;
		count=names.get(0).length(); 
		for(int j=1;j<names.size();j++)
		{
			
			if(names.get(j).length()>count) 			
			{
				count=names.get(j).length();
				m=j;
			}
			}
		
		return names.get(m);
	}

	
	
}

