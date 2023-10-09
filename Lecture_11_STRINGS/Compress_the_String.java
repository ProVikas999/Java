package Lecture_11_STRINGS;

public class Compress_the_String {
	public static String Compress_String(String str) {
		str = str + " " ;
		int count = 1 ;
		String s = "" ;
		int n = str.length() ;
		char ch = str.charAt(0) ;
		for ( int i = 1 ; i < n ; i++) {
			if (str.charAt(i) == ch) {
				count = count + 1 ;
			}
			else if (i == n-1) {
				if (count != 1) {
					s = s + ch + count ;
				}else {
					s = s + ch ;
				}
				
			}
			else {
				if ( count != 1) {
					s = s + ch + count ;
				} else {
					s = s + ch ;
				}
				count = 1 ;
				
			}
			ch = str.charAt(i) ;
		} return s ;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaabbkkkbbccddeeeabmac" ;
		String result = Compress_String(str) ;
		System.out.println(result);
		

	}

}
