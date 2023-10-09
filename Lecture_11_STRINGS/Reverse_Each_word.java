package Lecture_11_STRINGS;

public class Reverse_Each_word {
	public static String reverseEachWord(String str) {
		String ans = "" ;
		String start = "" ;
		int n = str.length() ;
		
		for(int i = 0 ; i<n ; i++) {
			char ch = str.charAt(i) ;
			if (str.charAt(i) == ' ') {
				ans = ans + start ;
				ans = ans + " " ;
				start = "" ;
			}
			else {
				start = ch + start ;
			}
			
		}
		ans = ans + start ;
		return ans;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		              Welcome to Coding Ninjas
		String str = "emocleW ot gnidoC sajniN" ;
		String result = reverseEachWord(str) ;
		System.out.println(result);

	}

}
