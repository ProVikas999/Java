package Logical_prblm_practice;

import java.util.Scanner;

public class Half_Diamond_number_ptrn {                                                   //*
	public static void main(String[] args) {                                              //*1*
		// TODO Auto-generated method stub                                                //*121*
		Scanner s = new Scanner(System.in);                                               //*12321*
		int n = s.nextInt();                                                              //*121*
		for (int i = 1 ; i<=n+1 ; i++) {                                                  //*1*
			for (int j = 1 ; j<=i ; j++) {                                                // *   
			 if (j == 1) {
				 System.out.print("*");
			 }
			 else {
				 System.out.print(j-1);
			 }
			}
			for (int k = i-1 ; k>=1 ;k--) {
				 if (k == 1) {
					 System.out.print("*");
				 }
				 else {
					 System.out.print(k-1);
				 }
			}
			System.out.println();
			}
		for (int i = 1 ; i<=n ; i++) {
			for (int j = 1; j<=n-i+1 ; j++) {
				 if (j == 1) {
					 System.out.print("*");
				 }
				 else {
					 System.out.print(j-1);
				 }
			} 
			for (int k = n-i ; k>=1 ; k--) {
				if (k == 1) {
					 System.out.print("*");
				 }
				 else {
					 System.out.print(k-1);
				 }
			}
			System.out.println();
			}
		}

	}


