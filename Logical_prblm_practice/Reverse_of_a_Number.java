package Logical_prblm_practice;

import java.util.Scanner;

public class Reverse_of_a_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
//		Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 
//		10400 will be 401 instead of 00401.
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = 0;
		while (n>0) {
			int i = n % 10;
			ans = ans * 10 + i ;
			n = n/10;
		}
   	System.out.println(ans);
//		System.out.println(12345%10);
//		System.out.println(12345/10);

//		System.out.println(10/2);
//		System.out.println(10%2);
	    
	    
	    
		 

	}

}
