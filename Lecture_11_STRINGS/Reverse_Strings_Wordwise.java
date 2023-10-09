package Lecture_11_STRINGS;

public class Reverse_Strings_Wordwise {
	public static void reverse_String (String str) {
		String ans = "" ;
		String start = "" ;
		
		for ( int i = 0 ; i < str.length()  ; i++) {
			char ch = str.charAt(i) ;
			if ( ch != ' ') {
				ans = start + ans ;
				ans  = " " + ans ;
				start = "" ;
				
			}else {
				start = start + ch ;
			}

		}
		ans = start + ans ;
//		return ans ;
		
		System.out.println(ans);
		
	}

	public static void main(String[] args) {
		String str = "abcd efghi jklmnop qestu vwxyz" ;
		 reverse_String(str) ;

	}

}
