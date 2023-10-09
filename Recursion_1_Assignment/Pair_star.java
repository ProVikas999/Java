package Recursion_1_Assignment;

public class Pair_star {
	public static String addstars(String input) {
		if ( input.length() <= 1) {
			return input ;
		}
		if ( input.charAt(0) == input.charAt(1)) {
			return input.charAt(0) + "*" + addstars(input.substring(1)) ;
		}
		return input.charAt(0) + addstars(input.substring(1)) ;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String input = "hello raajaa" ;
		String ans = addstars(input) ;
		System.out.println(ans);
		

	}

}
