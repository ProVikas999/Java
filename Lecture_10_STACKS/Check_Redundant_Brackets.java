package Lecture_10_STACKS;

import java.util.Stack;

public class Check_Redundant_Brackets {
	public static boolean redundantbrackets(String expression) {
		Stack<Character> s = new Stack<>() ;
		int count = 0;
		for ( int i = 0 ; i < expression.length() ; i++) {
			char j = expression.charAt(i) ;
			
			if (j != ')') {
				s.push(j) ;
			}
			else {
				while (!s.isEmpty() && s.peek() != '(') {
					s.pop() ;
					count++ ;
				}
				if ( count == 0 || count == 1) {
					return true ;
				}
				s.pop() ;
				count = 0;
				
			}
		}
		return false ;
	}
	public static void main(String[] args) {
	String expression = "(a+b+(c+d))" ;
	System.out.println(redundantbrackets(expression)) ;
	
	}

}
