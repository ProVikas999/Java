package ARRAYS_2_Lecture_10;

public class Selection_Sort_Code {
	public static void SelectionSort (int arr[]) {
		for ( int i = 0 ; i < arr.length - 1 ; i++) {
			int min = arr[i] ;
			int minIndex = i ;
			for ( int j = i+1 ; j < arr.length ; j++) {
				if (min > arr[j]) {
					min = arr[j] ;
					minIndex = j ;
				}
			}
			if (minIndex !=  i) {
			arr[minIndex] = arr [i] ;
			arr [i] = min; 
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20,12,10,15,2,-1,-2,18} ;
		SelectionSort(arr) ;
		for (int i = 0 ; i< arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		}
	}


