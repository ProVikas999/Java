package Lecture_21_Dynamic_Programming_1;

public class Minimum_Step_To_1 {
	
//	 Minimum_Step_To_1 Through Recursion 
	
	public static int CountSteps(int n) {
		
		if ( n == 1) {
			return 0 ;
		}
		int option1 = CountSteps(n-1) ;
		int ans = option1 ;
		if ( n%3 == 0) {
			int option2 = CountSteps(n/3) ;
			if ( option2 < ans ) {
				ans = option2 ;
			}
		}
		if ( n%2 == 0) {
			int option3 = CountSteps(n/2) ;
			if ( option3 < ans ) {
				ans = option3 ;
			}
		}
		return 1 +ans ;
	}

//	Minimum_Step_To_1 Through Recursion and Memorization-Storage
	
	public static int CountStepsMemo( int n) {
		int arr[] = new int [n+1] ;
		return HelperCountStepsMemo(n , arr) ;
	}
	public static int HelperCountStepsMemo(int n , int arr[]) {
		
		if ( n == 1) {
			arr[n] = 0 ;
			return arr[n] ;
		}
		if ( arr[n] != 0) {
			return arr[n] ;
		}
		int option1 = HelperCountStepsMemo(n-1, arr) ;
		int ans = option1 ;
		if ( n%3 == 0) {
			int option2 = HelperCountStepsMemo(n/3, arr) ;
			if ( option2 < ans ) {
				ans = option2 ;
			}
		}
		if ( n%2 == 0) {
			int option3 = HelperCountStepsMemo(n/2, arr) ;
			if ( option3 < ans ) {
				ans = option3 ;
			}
		}
		arr[n] = 1 + ans ;
		return arr[n] ;
	}
	
//	Minimum_Step_To_1 Through Dynamic Programming
	
	public static int CountStepsDP(int n) {
		
		int arr[] = new int[n + 1] ;
		arr[1] = 0 ;
		
		for ( int i = 2 ; i <=n ; i++) {
			int ans = arr[i-1] ;
			if ( i%3 == 0) {
				if ( ans > arr[i/3]) {
					ans = arr[i/3] ;
				}
			}
			if ( i%2 == 0) {
				if ( ans > arr[i/2]) {
					ans = arr[i/2] ;
				}
			}
			arr[i] = 1 + ans ;
		}
		return arr[n] ;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 650 ;
		
		int outputDp = CountStepsDP(n) ;
		System.out.println(outputDp);
		
		int outputM = CountStepsMemo(n) ;
		System.out.println(outputM);
		
		
		int outputR = CountSteps(n) ;
		System.out.println(outputR);
		
		

	}

}
