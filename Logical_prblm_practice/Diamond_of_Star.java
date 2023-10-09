package Logical_prblm_practice;

import java.util.Scanner;

public class Diamond_of_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 1 ;i<=n ; i++) {
			for (int space = 1 ; space <=n-i; space++) {
				System.out.print(" ");
			}
			for (int j = 1 ; j<=(2*i)-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n-1 ; i>=1 ; i--) {
			for (int space = 1 ; space <=n-i; space++) {
				System.out.print(" ");
			}
			for (int j = 1 ; j<=(2*i)-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
//   *
//  ***
// *****
//  ***
//   *

