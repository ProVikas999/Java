package Functions;

import java.util.Scanner;

public class NCR_with_More_Function {
	
	public static int factorial(int n) {
		int ans = 1;
		for(int i = 1 ; i <=n ; i++) {
			ans = ans *i;
		} return ans;	
	}
	public static int NCR (int n , int r) {
		
		int num = factorial(n);
		int den1 = factorial(n-r);
		int den2 = factorial(r);	
		int ans = num / (den1*den2);
		System.out.println(ans);
		return ans;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		int output = NCR(n,r);
//		System.out.println(output);
	}
}
