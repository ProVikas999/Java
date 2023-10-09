package Functions;

import java.util.Scanner;

 public class prime_Num_FUnc {
	 public static void Isprime (int n) {
		 for (int i = 2 ; i<=n ; i++) {
			 boolean Isprime = true;
			 for (int d = 2 ; d<i ; d++) {
				 if (i % d  == 0) {
					 Isprime = false ; 
					 break;
				 }
			 }
			 if (Isprime == true) {
				 System.out.println(i);
			 }
		 }
	 }
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	Isprime(n);	
}
}
