package Logical_prblm_practice;

import java.util.Scanner;

public class Squareroot_integral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i*i<=n) {
			i++;
		}System.out.println(i-1);

	}

}
