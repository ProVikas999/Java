package Logical_prblm_practice;

import java.util.Scanner;

public class Sum_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i<=n) {
			int j = 1;
			int sum = 0;
			while (j<=i) {
				System.out.print(j);
				sum = sum + j ;
				
				if (j<i) {
					System.out.print(" + ");
				}
				j++;
			}
			System.out.print(" = " + sum );
			System.out.println();
			i++;
			
		}
	}

}
//1 = 1
//1 + 2 = 3
//1 + 2 + 3 = 6
