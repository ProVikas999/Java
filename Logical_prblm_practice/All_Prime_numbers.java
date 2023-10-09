package Logical_prblm_practice;

import java.util.Scanner;

public class All_Prime_numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 2 ; i<=n ; i++) {
			boolean Prime = true;
			for (int d = 2 ;d<=i/2 ; d++) {
				if (i % d == 0) {
					
					Prime = false;
					break;
				}
			}
			if (Prime == true) 
				System.out.println(i);
			
		}	
	}
}
