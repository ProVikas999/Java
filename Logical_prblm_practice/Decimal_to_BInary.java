package Logical_prblm_practice;

import java.util.Scanner;

public class Decimal_to_BInary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = 0;
		int power = 1;
		while (n>0) {
			int rem = n % 2 ;
			ans = ans + rem * power ;
			power = power * 10 ;
			n = n/2 ;
		} System.out.println(ans);
//		System.out.println(10 % 2);
//		System.out.println(1 % 2);

	}

}
