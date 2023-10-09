package Lecture_10_STACKS;
import java.util.* ;

public class Balanced_Paranthesis {
	  public static boolean isBalanced(String expression) {
		  Stack<Character> s = new Stack<>() ;
		  for ( int i = 0 ; i< expression.length() ; i++) {
		  char j = expression.charAt(i) ;
		  if ( j == '(' || j == '[' || j == '{' ) {
			  s.push(j) ;
		  }
		  else if( j == ')' || j == ']' || j == '}') {
			  if ( s.isEmpty()) {
				  return false ;
			  }
			  else {
				  if (j == ')') {
					  if ( s.peek() == ')') {
						  s.pop() ;
					  }
					  else {
						  return false ;
					  }
				  }
				  else if(j == ']') {
					  if ( s.peek() == ']') {
						  s.pop() ;
					  }
					  else {
						  return false ;
					  }
				  }
				  else if ( j == '}') {
					  if ( s.peek() == '}') {
						  s.pop() ;
					  }
					  else {
						  return false ;
					  }
				  }
			  }
		  }
		  
		  }
		  
		  return s.isEmpty() ;
	  }
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Stack<Character> stack = new Stack<>() ;
//		
//		for (int i = 0  ;i < 10 ; i++) {
//			stack.push('{') ;
//			stack.push('}') ;
//		}
//	char arr[] = {[[[[]]]]()} ;
//	}

}
