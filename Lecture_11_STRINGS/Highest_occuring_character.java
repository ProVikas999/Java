package Lecture_11_STRINGS;

public class Highest_occuring_character {
	public static char highestOccuringChar(String str) {
		int freq[] = new int[256] ;
		for(int i= 0 ; i < str.length() ; i++) {
			freq[str.charAt(i)]++ ;
		}
		char ch = str.charAt(0) ;
		int max = Integer.MIN_VALUE ;
		
		for ( int i = 0 ; i < str.length() ; i++) {
			if (max < freq[str.charAt(i)] ) {
				
				max = freq[str.charAt(i)] ;
				ch = str.charAt(i) ;
			}
		}return ch ;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "bkbbccddeeeabmac" ;
		char ans = highestOccuringChar(str) ;
		System.out.println(ans);

	}

}
