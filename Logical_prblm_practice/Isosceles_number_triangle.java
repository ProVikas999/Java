package Logical_prblm_practice;

import java.util.Scanner;

public class Isosceles_number_triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
//		BY WHILE LOOP
//		int i = 1;
//		while(i<=n) {
//		int spaces = 1;
//		while (spaces <=n-i) {
//			System.out.print(" ");
//			spaces++;
//		}
//		int j = 1;
//		while (j<=i) {
//			System.out.print(j);
//			j++;
//		}
//		int k = i-1;
//		while(k>=1) {
//		System.out.print(k);
//		k--;
//		}
//		i++;
//	  System.out.println();
//		}
		
//		 BY FOR LOOP
		for (int i = 1; i<=n ; i++) {
			for(int spaces = 1 ; spaces<=n-i ; spaces++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j<=i ; j++) {
				System.out.print(j);
			}
			for (int k = i-1 ; k>=1 ; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		
	} 
}
