package Logical_prblm_practice;

import java.util.Scanner;

public class Terms_of_AP {

public static void main(String[] args) {
		
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int i = 1;
int count = 1;
while(count<=n) {
	int k = 3*i + 2;
	if ( k % 4  != 0) {
		System.out.print(k + " ");
		count++;
	}
	i++;
}

}
}
