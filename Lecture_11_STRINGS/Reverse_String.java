package Lecture_11_STRINGS;

public class Reverse_String {
	public static String reverse_String (String str) {
//		reversedstring (rs)
		String rs = "" ;
//		for (int i = str.length() - 1 ; i >=0 ; i--) {
//			rs = rs + str.charAt(i) ;
//		}
		for ( int i = 0 ; i < str.length() ; i++) {
			rs = str.charAt(i) + rs ;
		}
		return rs ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd efghi jklmnop qestu vwxyz" ;
		String str2 = reverse_String(str) ;
		System.out.println(str2);

	}

}
