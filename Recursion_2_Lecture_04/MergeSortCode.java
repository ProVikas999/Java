package Recursion_2_Lecture_04;

public class MergeSortCode {
	public static void MergeSort(int input[]) {
		if ( input.length <= 1) {
			return ;
		}
		int mid = input.length / 2 ;
		int arr1[] = new int [mid] ;
		int arr2[] = new int [input.length - mid] ;
		int si = 0 ;
		
		for ( int i = 0 ; i < arr1.length ; i++) {
			arr1[i] = input[i] ;
		}
		for ( int i = 0 ; i < arr2.length ; i++) {
			arr2[i] = input[i + mid] ;
		}
		MergeSort(arr1);
		MergeSort(arr2);
		Merge(input , arr1 , arr2) ;
		
	}
	private static void Merge(int input[] , int arr1 [] , int arr2 []) {
		int i = 0 ;
		int j = 0 ;
		int k = 0 ;
		while ( i < arr1.length && j < arr2.length) {
			if ( arr1[i] < arr2[j]) {
				input[k] = arr1[i] ;
				i++;
				k++;
			}
			else {
				input[k] = arr2[j] ;
				j++;
				k++;	
			}
		}
		while ( i < arr1.length) {
			input[k] = arr1[i] ;
			i++;
			k++;
		}
		while (j < arr2.length) {
			input[k] = arr2[j] ;
			j++;
			k++;	
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {9,8,7,6,5,4,3,2,1,0,9,49,78,25,14,22,222} ;
		 MergeSort(input);
		 for ( int i = 0 ; i < input.length ; i++) {
			 System.out.print(input[i] + " ");
		 }
		

	}

}
