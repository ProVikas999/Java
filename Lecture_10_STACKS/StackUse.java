package Lecture_10_STACKS;
// //import java .util.Stack;

public class StackUse {

	public static void main(String[] args) throws StackFullException {
		Stack_Using_Array stack = new Stack_Using_Array(3) ;
		
//	StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<Integer>() ;
		for ( int i = 1 ; i <= 10 ; i++) {
			stack.push(i*2 );
		}
		while ( !stack.isEmpty()) {
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				// TODO: handle exception
				//never reach here 
			}
		}
		
//	//	Stack<Integer> stack = new Stack<>() ;
////		stack.push(100) ;
//	//System.out.println(stack.peek()) ;
		
		

	}
	

}
