package Lecture_12_ARRAYS_2D;

public class Jagged_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int [5][] ;
		for ( int i = 0 ; i< arr.length ; i++) {
			arr[i] = new int [i+1] ; 
		}
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = 0 ; j< arr[i].length ; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
