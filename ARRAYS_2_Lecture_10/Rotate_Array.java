package ARRAYS_2_Lecture_10;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,2,3,4,5,6,7} ;
		int d = 2 ;
		int k = 0 ;
		int arr2 [] = new int [d] ;
		for (int i = 0 ; i<d ;i++){
			arr2[i] = arr[i] ;
		}
		for (int j = d ; j< arr.length ; j++) {
			System.out.print(arr[j] + " ");
		}
//		if ( d == arr.length ) {
//			return ;
//		}
		while (k< arr2.length) {
			System.out.print(arr[k] + "  " );
			k++ ;
		}
		

	}

}
