package practice;

import java.util.Scanner;

public class Triangular_Ptrn_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int startnum = 1;
		while(i<=n) {
	    int j = 1;
	    while(j<=i) {
	    	System.out.print(startnum);
	    	startnum++;
	    	j++;
	    }
	    System.out.println();
			i++;
		}
		

	}

}
//1
//23
//456
//78910