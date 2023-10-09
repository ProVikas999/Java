package Recursion_1_Lecture_03;

public class SumOfArray {
	public static int sumArray(int input[]) {
		if (input.length == 0) {
			return 0;
		}
		if (input.length == 1) {
			return input[0] ;
		}
		int arr[] = new int[input.length - 1] ;
		for (int i = 1 ; i< input.length ; i++) {
			arr[i-1] = input[i] ;
		}
		return sumArray(arr) + input[0] ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {1,2,3,4,5} ;
		int result = sumArray(input) ;
		System.out.println(result);
		

	}

}
