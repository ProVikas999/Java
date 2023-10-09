package practice;

import java.util.Scanner;

public class Triangular_ptrn_2 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int i = 1;
	while(i<=n) {
		int j = 1;
		while (j<=i) {
			System.out.print(j + i - 1);
			j++;
		}
		System.out.println();
		i++;
	}
	}

}
//1
//23
//345
//4567