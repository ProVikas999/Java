package Lecture_11_STRINGS;

public class String_Palindrome {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "racecar" ;
		String rs = "" ;
		for (int i = 0 ; i < str.length() ; i++){
			rs =  str.charAt(i) + rs   ;
		}
		if (str.equals(rs)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
			}
//		return true ;

		

	}

}
