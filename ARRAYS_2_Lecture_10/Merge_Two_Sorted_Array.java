package ARRAYS_2_Lecture_10;

public class Merge_Two_Sorted_Array {
	public static void Merge ( int arr1[] , int arr2[]) {
		int arr3[] = new int [arr1.length + arr2.length] ;
		int i = 0;
		int j = 0;
		int k = 0;
		while ( i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i] ;
				k++;
				i++;
			}
			else {
				arr3[k] = arr2[j] ;
				k++;
				j++;
				
			}
		}
			while ( i < arr1.length) {
				arr3[k] = arr1[i] ;
				k++;
				i++;
			}
			while ( j < arr2.length ) {
				arr3[k] = arr2[j] ;
				k++;
				j++;
			}
			for (int p = 0 ; p< arr3.length ; p++) {
				   System.out.print(arr3[p] + " ");
			   }
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1 [] = {1,2,3,4,5,60} ;
		int arr2 [] = {0,3,6,7,600} ;
		 Merge ( arr1 , arr2) ;

	}
	}

