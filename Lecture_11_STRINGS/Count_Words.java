package Lecture_11_STRINGS;
//import java.util.* ;

public class Count_Words {
	public static int countWord (String str) {
		int count = 1 ;
		if (str.length() == 0) {
			return 0;
		}
		for (int i = 0 ; i< str.length() ; i++) {
			if (str.charAt(i) == ' ') {
				count ++ ;
			}
			
		} return count;
		
	}

	public static void main(String[] args) {
	String str = "my name is vikas" ;
	int k = countWord(str) ;
     System.out.println(k);
	}
}

