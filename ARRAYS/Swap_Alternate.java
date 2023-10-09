package ARRAYS;

import java.util.*;

public class Swap_Alternate {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		for (int i = 0 ; i<arr.length-1 ; i = i+2) {
			int temp = 0 ;
			temp = arr[i];
			arr[i] = arr[i + 1];
			 arr[i + 1] = temp;
		}
		
		
		for (int i = 0 ; i<arr.length ; i++) {
		System.out.print(arr[i ]+ " ");
			
		}
	}

	}


