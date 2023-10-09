package Lecture_13_Binary_Trees;

public class QueueUsingLL<T> {
	private Node<T> front ;
	private Node<T> rear ;
	int size ; 
	
	public QueueUsingLL() {
		// TODO Auto-generated constructor stub
		front = null ;
		rear = null ;
		size = 0 ;
	}
	int size() {
		return size ;
	}
	boolean isEmpty () {
		return size () == 0 ;
	}
	
	T front () throws QueueEmptyException {
		if ( front == null) {
			throw new QueueEmptyException() ;
		}
		
		return front.data ;
	}
	void enqueue (T value) {
		Node<T> newNode = new Node<T>(value) ;
		if ( front == null ) {
			newNode.next = null ;
			front = newNode ;
			rear = newNode ;
			size++ ;
		}
		else {
			rear.next = newNode ;
			newNode.next = null ;
			rear = newNode ;
			size++ ;
		}
	}
	T dequeue () throws QueueEmptyException {
		if ( front == null) {
			throw new QueueEmptyException() ;
		}
		if ( size == 0) {
			rear = null ;
			front = null ;
		}
		T temp = front.data ;
		front = front.next ;
		size-- ;
		return temp ;
	}
}
