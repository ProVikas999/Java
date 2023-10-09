package ARRAYS_2_Lecture_10;

public class Second_Largest_In_Array {
	public static int SecondLargest (int arr[]) {            // BY SORTING -- we did this.
		for (int i = 0 ; i < arr.length-1 ; i++) {
			for (int j = 0 ; j< arr.length-i-1 ; j++) {
			if (arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1] ;
				arr[j+1] = temp;
			}
			}
		} int s = arr[arr.length - 2] ;
		return s;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {10,2,-30,4,50} ;
		
		int k = SecondLargest(arr) ;
       System.out.println(k);
	}

}
