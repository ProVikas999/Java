//package Functions;
//
//import java.util.Scanner;
//
//public class Prime_num_more_Function {
//	public static boolean Isprime (int n) {
//		boolean prime = true;
//		for (int d = 2 ; d<n ; d++) {
//			if (n % d == 0) {
//			 return false ;
//			}
//		}
//			return true ;
//		}
//	
//	
//	public static void Printprime (int n ) {
//		for (int i = 2 ; i<=n ; i++) {
//			Boolean ISPRIME = Isprime(i);   // Calling (ISPRIME)function in (Printprime)function .
//				if (ISPRIME) {
//				System.out.println(i);	
//		}
//	}
//}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		Printprime(n);
//	}
//}
