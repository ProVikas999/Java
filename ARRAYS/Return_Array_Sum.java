package ARRAYS;

import java.util.Scanner;



public class Return_Array_Sum {
	public static int sum (int arr[]) {
		int sum = 0 ;
		for (int i = 0 ; i < arr.length ; i++) {
			sum = sum + arr[i];	
		}
		return sum;	
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for ( int i = 0 ; i<size ; i++) {
			arr[i] = s.nextInt();
		}
		int k = sum(arr);
		 System.out.println(k);
	}

}
