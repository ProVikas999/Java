package Recursion_1_Assignment;

public class RemoveX {
	public static String removeX(String input) {
		if (input.length() == 0) {
			return " " ;
		}
		String ans = "" ;
		if (input.charAt(0) != 'x') {
			ans = ans + input.charAt(0) ;
		}
		return ans + removeX(input.substring(1)) ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "xxabcxxdefxx" ;
		System.out.println(removeX(input));
		

	}

}
