package Recursion_1_Assignment;

public class StringToInteger {
	public static int ConvertStringToInt (String input) {
		if ( input.length() == 1) {
			return (input.charAt(0) - '0') ;
		}
		double y = ConvertStringToInt(input.substring(1)) ;
		double x = input.charAt(0) - '0' ;
		x = x * Math.pow(10, input.length() - 1) + y ;
		return (int)(x) ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "00123405" ;
		int result = ConvertStringToInt(input) ;
		System.out.println(result);

	}

}
