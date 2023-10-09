package Lecture_11_QUEUES;

public class _01_Queue_Using_Array {
	
	private int data [] ;
	private int front ;
	private int rear ;
	private int size ; 
	
	public _01_Queue_Using_Array() {
		// TODO Auto-generated constructor stub
		data = new int[3] ;
		front = -1 ;
		rear = -1 ;
		size = 0 ;
	}
	public _01_Queue_Using_Array(int capacity) {
		data = new int[capacity] ;
		front = -1 ;
		rear = -1 ;
		size = 0 ;
	}
	int size () {
		return size ;
	}
	boolean isEmpty () {
		return size == 0 ;
	}
	int front() throws QueueEmptyException {
		if ( size == 0) {
			throw new QueueEmptyException() ;
		}
		return data[front] ;
	}
	void doublecapacity() {
		int temp [] = data ;
		data = new int [2 * temp.length] ;
		int index = 0 ;
		for ( int i = front ; i< temp.length ; i++) {
			data[index] = temp[i] ;
			index ++ ;
		}
		for (int i = 0 ; i < front ; i++) {
			data[index] = temp[i] ;
			index ++ ;
		}
		front = 0 ;
		rear = temp.length -1 ;
	}

	void enqueue ( int element) throws QueueFullException  {
		if ( size == data.length) {
			doublecapacity () ;
//			throw new QueueFullException() ;
		}
		
		if ( size == 0) {
			front = 0 ;
		}
		size ++ ;
		rear++ ;
		if ( rear == data.length ) {
			rear = 0 ;
		}
		data[rear] = element ;
	}
	int dequeue () throws QueueEmptyException {
		if ( size == 0) {
			throw new QueueEmptyException() ;
		}
		
		int temp = data [front] ;
		front++ ;
		if ( front == data.length ) {
			front = 0 ;
		}
		size-- ;
		if ( size == 0) {
			front = -1 ;
			rear = -1 ;
		}
		return temp ;
	}
	

}

















