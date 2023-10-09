package Lecture_12_TREES;

import Lecture_12_TREES.Node;

public class _02_Queue_using_LinkedList<T> {
	 Node<T> front ;
	 Node<T> rear ;
	int size ; 
	
	public _02_Queue_using_LinkedList() {
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
	public void enqueue (TreeNode<Integer> root) {
		Node<T> newNode = new Node<T>(root) ;
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
	public T dequeue () throws QueueEmptyException {
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













