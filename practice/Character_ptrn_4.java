package practice;

import java.util.Scanner;

public class Character_ptrn_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i<=n) {
			int j = 1;
//			char sc = (char)('A'+i-1);
			char sc = (char)('A'+n-1);
			while(j<=i) {
				System.out.print(sc);
				j++;
				sc = (char)(sc+1);
			}
			System.out.println();
			i++;
		}
	}

}
