package Recursion_1_Lecture_03;

import java.util.Scanner;

public class Fibonacci_Number {
	public static int Fib(int n) {
		if ( n == 0 || n == 1) {
			return n ;
		}
		
		return Fib(n-1) + Fib(n-2) ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		System.out.println("Enter N :  ");
		int n = s.nextInt() ;
		for (int i = 0 ; i< n ;i++) {
			
		
		System.out.println(Fib(i));
		}
	}

}
//0
//1
//1
//2
//3
//5
//8
//13
//21
//34
//
