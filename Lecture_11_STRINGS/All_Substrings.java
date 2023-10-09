package Lecture_11_STRINGS;

public class All_Substrings {
	public static void allSubstring (String str) {
		for (int i = 0 ; i < str.length() ; i++) {
			for (int j = i ; j < str.length() ; j++) {		
				System.out.println(str.substring(i, j+1));
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc" ;
		allSubstring(str) ;
		
		

	}

}
