package Functions;

import java.util.Scanner;

public class Prime_Num_without_Function {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 2 ; i<=n ; i++ ) {
			boolean Prime = true;
			for (int d = 2 ; d<i ; d++) {
				if (i % d == 0 ) {
					Prime = false;
					break;
				}
			}
				if (Prime == true) {
					System.out.println(i);					
		   }
		}
		
	}

}
