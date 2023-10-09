package ARRAYS;

import java.util.*;

public class Find_Unique {

	public static void main(String[] args) {
		int arr[] = {10,2,500,11,3,4,5,5,4,3,2,10,500};
		for (int i = 0 ; i<arr.length ; i++) {
			int j;
			for ( j = 0 ; j < arr.length ; j++) {
				if (i!=j &&  arr[i]==arr[j] ){
			       break;
				}
			}
				if(j==arr.length) {
					System.out.println(arr[i]);
				}

				    			}
//		
//		int arr[] = {10,2,3,4,5,5,4,3,2,10,500};
//		int arr[] = {1,2,3,4,5,6,7,7};
//		int ans = 0;
//		for (int i = 0 ; i< arr.length ; i++) {
//			ans = ans ^ arr[i];
//		}
//		System.out.println(ans);
//		
	}

}
