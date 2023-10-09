package Lecture_10_STACKS;

public class StackUsingLinkedList<T> {
	private Node<T> head ;
	private int size ;
	
	public StackUsingLinkedList() {
		head = null ;
		size = 0 ;
	}
	public int size() {
		return size ;
	}
	public boolean isEmpty() {
//		if ( size == 0) {
//			return true ;
//		}
//		else {
//			return false ;
//		}
		return size() == 0;
	}
	
	public void push(T element) {
	Node<T> newNode = new Node<T>(element) ;
//	newNode.data = Element ;
	
	newNode.next = head ;
	head = newNode ;
		size++ ;
	}
	public T pop() throws StackEmptyException {
		if (size()  == 0) {
//			StackEmptyException e = new StackEmptyException() ;
//			throw e ;
			 throw new StackEmptyException() ;
		}
		T tempdata = head.data ;
		head = head.next ;
		size-- ;
		return tempdata ;
	}
	public T top() throws StackEmptyException {
		if (size() == 0) {
//			StackEmptyException e = new StackEmptyException() ;
//			throw e ;
			 throw new StackEmptyException() ;
		}
		return head.data ;
	}

}
