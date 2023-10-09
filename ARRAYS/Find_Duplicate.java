package ARRAYS;

import java.util.Scanner;

public class Find_Duplicate {
	
	public static int find_duplicate(int arr[]) {
		for (int i = 0 ; i<arr.length; i++) {
			for (int j = i+1 ; j <arr.length ; j++ ) {
				if (arr[i] == arr[j]) {
//					System.out.println(arr[i]);
					return(arr[i]);
				}	
			
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1000,2,20,30,40,50,100,20};
		int k =find_duplicate(arr);
		System.out.println(k);

	}

}
