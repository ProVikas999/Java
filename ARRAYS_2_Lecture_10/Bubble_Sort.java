package ARRAYS_2_Lecture_10;

public class Bubble_Sort {
	public static void Bubble_sort(int arr[]) {
		for (int i = 0 ; i < arr.length - 1 ; i++) {
			for ( int j = 0 ; j< arr.length -1-i ; j++) {
				if ( arr [j] > arr [j+1]) {
					int temp = 0 ;
					temp = arr [j] ;
					arr [j] = arr[j+1] ;
					arr [j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {20,12,10,15,2,-1,-2,18} ;
		int arr [] = {-2,45,0,11,-9};
		Bubble_sort(arr) ;
		for (int i = 0 ; i< arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		}
	}
