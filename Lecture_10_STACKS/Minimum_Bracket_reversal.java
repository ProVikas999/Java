package Lecture_10_STACKS;

import java.util.Stack;

public class Minimum_Bracket_reversal {
	public static int countBracketReversal(String input) {
		Stack<Character> s = new Stack<>() ;
		int count = 0 ;
		if ( input.length() % 2 != 0  || input.length() <=1) {
			return -1 ;
		}
		else {
			for (int i = 0 ; i < input.length() ; i++) {
				char j = input.charAt(i) ;
				
				if ( j != '}') {
					s.push(j) ;
				}
				else {
					if ( !s.isEmpty() && s.peek() == '{') {
						s.pop() ;
					}
					else if (!s.isEmpty() && s.peek() == '}') {
						s.push(j) ;
					}
					else if (s.isEmpty()) {
						s.push(j) ;
					}
				}
				
			}
			while ( !s.isEmpty()) {
				char c1 = s.pop() ;
				char c2 = s.pop() ;
				if ( c1 == c2) {
					count++ ;
				}
				else {
					count = count + 2;
				}
			}
		}
		return count ; 
		
	}
	public static void main(String[] args) {
		String input = "{{{{{{{}}{{{" ;
		System.out.println(countBracketReversal(input)) ;
	}

}
