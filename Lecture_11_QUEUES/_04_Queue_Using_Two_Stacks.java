package Lecture_11_QUEUES;
import java.util.* ;

public class _04_Queue_Using_Two_Stacks<T> {
	private Stack<Integer> s1 ;
	private Stack<Integer> s2 ;
	int size ;
	
	public _04_Queue_Using_Two_Stacks() {
		s1 = new Stack<>() ;
		s2 = new Stack<>() ;
		size = 0 ;
	}
	public int getsize() {
		return size ;
	}
	public boolean isEmpty() {
		return getsize() == 0 ;
	}
	public void enqueue(int element) {
		s1.push(element) ;
		size++ ;
	}
	public int dequeue() {
		if ( s1.isEmpty()) {
			return -1 ;
		}
		while ( s1.size() != 1) {
			s2.push(s1.pop()) ;
		}
		int temp = s1.pop() ;
		while ( !s2.isEmpty()) {
			s1.push(s2.pop()) ;
		}
		size-- ;
		return temp ;
	}
	public int top () {
		if ( s1.isEmpty()) {
			return -1 ;
		}
		while ( s1.size() != 1) {
			s2.push(s1.pop()) ;
		}
		int top = s1.peek() ;
		while ( !s2.isEmpty()) {
			s1.push(s2.pop()) ;
		}
		return top ;	
	}
	
	public static void main(String[] args) {
		
		_04_Queue_Using_Two_Stacks<Integer>q = new _04_Queue_Using_Two_Stacks<>() ;
		 for(int i = 1; i <= 5; i++){
			 q.enqueue(i*10) ;
		 }
			while(! q.isEmpty()){
				
					System.out.println(q.dequeue());
				
			}
	}
}
