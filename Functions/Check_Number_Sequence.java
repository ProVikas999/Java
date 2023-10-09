package Functions;

import java.util.Scanner;

public class Check_Number_Sequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int P = s.nextInt();
		boolean Isdec = true ;
		for (int i = 1 ; i<n ; i++) {
			int C = s.nextInt();
//			boolean Isdec = true ;
			
			if (P == C) {
				Isdec = false;
				System.out.println(false + " coz (P = C)");
			return ;
			}
			if (C<P) {
				if(Isdec == false) {
					System.out.println(false + " coz(C<P)");
					return;
				}
			}
			if (C>P) {
				if (Isdec == true) {
					Isdec = false;		
				}
			}
			P = C;
		}
		System.out.println(true);
		

	}

}
