package practice;

import java.util.Scanner;

public class Star_ParalleloGM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		
		while (i<=n) {
			int spaces = 1;
			while (spaces<i) {
				System.out.print(" ");
				spaces++;
			}
			int j = 1;
			while (j<=n) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		

	}

}
//****
// ****
//   ****
//     ****