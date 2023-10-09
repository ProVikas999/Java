package Functions;

import java.util.Scanner;

public class NCR_with_Functions {
	
	public static int Factorial(int n ) {
		int ans = 1;
		for (int i = 1 ; i<=n ; i++) {
			ans = ans * i;
		}
		return ans;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		
		int num = Factorial(n);
		int den1 = Factorial(n-r);
		int den2 = Factorial(r);
		
		int ans = num / (den1* den2);
		System.out.println(ans);
		

	}

}
