package Logical_prblm_practice;

import java.util.Scanner;

public class Nth_Fibonacci_num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3 = 1;
		int i = 1;
		
		while(i<n) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
//			System.out.println(n3); for print every fib. no.
			i++;
		}
		System.out.println(n3);
	}

}