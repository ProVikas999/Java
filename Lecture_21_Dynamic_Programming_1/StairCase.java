package Lecture_21_Dynamic_Programming_1;

public class StairCase {
	public static long staircase(int n) {
		long arr[] = new long[n+1] ;
		arr[0] = 1 ;
		arr[1] = 1 ;
		
		for ( int i = 2 ; i < arr.length ; i++) {
			long op2 = 0 ;
			long op3 = 0 ;
			long op1 = arr[i-1] ;
			
			if (i-2 >= 0) {
				op2 = arr[i-2] ;
			}
			if (i-3 >= 0) {
				op3 = arr[i-3] ;
			}
			arr[i] = op1 + op2 + op3 ;
		}
		return arr[n] ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4 ;
		System.out.println(staircase(n));

	}

}
