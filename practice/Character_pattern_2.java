package practice;

import java.util.Scanner;

public class Character_pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		char sc = 'A';
		int i = 1;
		while(i<=n) {
			int j = 1;
			while(j<=n) {
				System.out.print(sc);
				j++ ;
				sc = (char)(sc+1);
			}
			System.out.println();
			i++;
		}
	}

}
//ABCD
//EFGH
//IJKL
//MNOP