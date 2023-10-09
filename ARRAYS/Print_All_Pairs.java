package ARRAYS;

import java.util.Scanner;

public class Print_All_Pairs {
	
	public static void print_pairs(int arr[]) {
		for (int i = 0 ; i<arr.length-1 ; i++) {
			for (int j = i+1 ; j<arr.length ; j++) {
				System.out.println( "(" + arr[i] + "," + arr[j] + ")");
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i<n ; i++  ) {
			arr[i] = s.nextInt();
			
		}
		print_pairs(arr);
		
	}

}
