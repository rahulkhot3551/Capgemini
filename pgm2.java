package ui;

import java.util.Scanner;

/**
 * 
 * @author spavanku
 * 
 * accept string as an input from the user, and return the output as string by replacing 
 * the each and every character with next character of the given input.
 * 
 *  sample Input 1:
 *  =============
 *  capgemini
 *  
 *  Sample output 1:
 *  ==============
 *  dbqfnjoj
 * 
 * 	sample Input 2:
 *  ===============
 *  apple
 * 
 *  Sample output 2:
 *  ==============
 *  bqqmf
 *  
 */
public class pgm2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		System.out.println(getString(str));
		sc.close();
	}

	public static String getString(String organization) {
		
		String ans="";
		for(int i=0;i<organization.length();i++)
		{
			char ch=organization.charAt(i);
			ans=ans+(++ch);
		}
		
		return ans;

	}


}
