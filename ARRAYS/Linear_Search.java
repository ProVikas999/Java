package ARRAYS;

import java.util.Scanner;

public class Linear_Search {
	
	public static int search (int arr[] , int x) {
		for(int i = 0 ; i < arr.length ; i++) {
			if (arr[i] == x) {
				return i;
			}
		} 
		return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for( int i = 0; i<t ; t++) {
			int size = s.nextInt();
			int arr[] = new int [size];
			for(int j = 0 ; j<size ; j++) {
				arr[j] = s.nextInt();	
			}
			int x = s.nextInt();
		
		int k = search(arr, x);
		System.out.println(k);
	}

	}

}
