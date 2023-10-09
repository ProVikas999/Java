package practice;

import java.util.Scanner;

public class Chracter_pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i<=n) {
			int j = 1;
			char sc = (char)('A'+i-1);
			while (j<=n) {
				System.out.print(sc);
				j++;
//				(char)(sc)++;
				sc = (char)(sc+1);
			}
			System.out.println();
			i++;
		}

	}

}
//ABCD
//BCDE
//CDEF
//DEFG