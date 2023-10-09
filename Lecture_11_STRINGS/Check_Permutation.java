package Lecture_11_STRINGS;

public class Check_Permutation {
	public static boolean Permutation(String str1 , String str2) {
		int freq1[] = new int[256] ;
		int freq2[] = new int[256] ;
		
		if (str1.length() != str2.length()) {
			return false ;
		}
		for (int i = 0 ; i < str1.length() ; i++) {
			freq1[str1.charAt(i)]++ ;
			freq2[str2.charAt(i)]++ ;
		}
		for (int i = 0 ; i < 256 ; i++) {
			if (freq1[i] != freq2[i]) {
				return false ;
			}
		}
		return true ;
	
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "omggsinrtg" ;
		String str2 = "stringomg" ;
		 Permutation( str1 , str2) ;
		System.out.println( Permutation( str1 , str2));
	}

}
