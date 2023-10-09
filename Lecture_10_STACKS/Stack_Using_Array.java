package Lecture_10_STACKS;

public class Stack_Using_Array {
	private int data [] ;
	private int top ;
	
	public Stack_Using_Array () { // constructor and class name should be same
		data = new int [10] ;
		top = -1 ;
	}
	public Stack_Using_Array (int capacity ) { // constructor and class name should be same
		data = new int [10] ;
		top = -1 ;
	}
	public boolean isEmpty() {
		if ( top == -1) {
			return true ;
		}
		else {
			return false ;
		}
//		return ( top == -1) ;
	}
	public int size() {
		return top +1 ;
	}
	public int top() throws StackEmptyException {
		if ( size() == 0) {
			StackEmptyException e = new StackEmptyException() ;
			throw e ;
		}
		return data[top] ;
	}
	
	public void doublecapacity() {
		int temp [] = data ;
		data = new int [2 * temp.length] ;
		for ( int i = 0 ; i <= top ; i++) {
			data[i] = temp[i] ;
		}
	}
	public void push (int element) throws StackFullException {
		if ( size() == data.length) {
//			StackFullException e = new StackFullException() ;
//			throw e ;
//		}
//		INSTEAD OF THROWING STACKFULLEXCEPTION WE CAN DOUBLE THE SIZE OF STACK 
//		i.e DOUBLE THE CAPACITY
		doublecapacity() ;
		}
		top++ ;
		data[top] = element ;
	}
	public int pop() throws StackEmptyException {
		if ( size() == 0) {
			StackEmptyException e = new StackEmptyException() ;
			throw e ;
		}
		
		int temp = data[top] ;
		top-- ;
		return temp ;
	}

}
 