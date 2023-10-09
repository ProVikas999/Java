package Logical_prblm_practice;

import java.util.Scanner;

public class Binary_to_Decimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n  = s.nextInt();
		int ans = 0;
		int power = 1;
		while (n>0) {
			int rem = n % 10;
			ans = ans + rem * power;
			power = power + power;
			n = n/10;
		} System.out.println(ans);

	}

}
