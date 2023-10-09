package Recursion_1_Lecture_03;

public class CheckPalindrome {
	public static boolean isStringPalindrome (String input) {
		int n = input.length() ;
		return CheckPalindrome(input , 0 , n - 1) ;
	}
	public static boolean CheckPalindrome(String input , int start , int end) {
		if ( input.length() == ' ') {
			return true ;
		}
		if ( start == end) {
			return true ;
		}
		if ( input.charAt(start) != input.charAt(end)) {
			return false ;
		}
		if ( start < end ) {
			return CheckPalindrome(input, start + 1, end - 1) ;
		}
		return true ;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = " monum" ;
		System.out.println(isStringPalindrome(input)) ;
		

	}

}
