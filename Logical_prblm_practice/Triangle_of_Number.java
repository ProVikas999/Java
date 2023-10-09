package Logical_prblm_practice;

import java.util.Scanner;

public class Triangle_of_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 1 ; i<=n ; i++) {
			for (int spaces = 1 ; spaces<=n-i ; spaces++) {
				System.out.print(" "); 
			}
			for (int j = 1 ; j<=i ; j++) {
				System.out.print(j+i-1);
			}
			for (int k = 2*i-2 ; k>=i ; k--) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
