package Recursion_1_Lecture_03;

import java.util.Scanner;

public class Factorial {
	 public static int fact(int n) {
		 if (n == 0) {
			 return 1 ;
		 }
		 int ans = fact(n-1) ;
		 return ans * n ;
	 }
	 public static void main(String args[]) {
		 
         Scanner s = new Scanner(System.in) ;
         System.out.println("Enter n : ");
		 int n = s.nextInt() ;
		 int result = fact(n) ;
		 System.out.println(result);
		 
	 }

}
