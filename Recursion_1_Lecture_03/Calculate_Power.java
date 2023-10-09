package Recursion_1_Lecture_03;

import java.util.Scanner;

public class Calculate_Power {
	public static int Power(int x , int n ) {
		if ( n == 0) {
			return 1 ;
		}
		return x*Power(x,n-1) ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println(Power(3,4));
	}

}
