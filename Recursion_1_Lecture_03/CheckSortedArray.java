package Recursion_1_Lecture_03;

public class CheckSortedArray {
	public static boolean checkSorted (int input[]) {
		if (input.length <= 1) {
//			System.out.println("true1");
			return true ;	
		}
	
		int arr[] = new int [input.length - 1] ;
		for (int i = 1 ; i < input.length ; i++) {
			arr[i-1] = input[i] ;
		}
		boolean ans = checkSorted(arr);
		if (!ans) {
//			System.out.println("false2");
			return false ;
		}
		if (input[0]<=input[1]) {
//			System.out.println("true2");
			return true ;
		}
		else {
//			System.out.println("false3");
			return false ;
		}
	}
	public static boolean checkSorted_2 (int input[]) {
		if (input.length <= 1) {
//			System.out.println("true1");
			return true ;	
		}
		if (input[0] > input[1]) {
			return false ;
		}
	
		int arr[] = new int [input.length - 1] ;
		for (int i = 1 ; i < input.length ; i++) {
			arr[i-1] = input[i] ;
		}
		boolean ans = checkSorted_2(arr);
		return ans ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {2,4,1,6,9,5} ;
		boolean result1 = checkSorted(input) ;
		boolean result2 = checkSorted_2(input) ;
		System.out.println(result1);
		System.out.println(result2);
		

	}

}
