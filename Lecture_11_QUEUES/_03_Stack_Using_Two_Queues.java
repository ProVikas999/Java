package Lecture_11_QUEUES;
import java.util.*;

public class _03_Stack_Using_Two_Queues<T> {
	    private Queue<Integer> q1;
	    private Queue<Integer> q2;
	    private int size;
	
	public _03_Stack_Using_Two_Queues() {
	q1 = new LinkedList<Integer>() ;
	q2 = new LinkedList<Integer>() ;
	size = 0 ;
	}
	
	 public int getSize() { 
	        //Implement the getSize() function
		 return size ;
	    }

	    public boolean isEmpty() {
	        //Implement the isEmpty() function
	    	return getSize() == 0 ;
	    }

	    public void push(int element) {
	        //Implement the push(element) function
	    	q1.add(element) ;
	        size++ ;
	    }

	    public int pop() {
	        //Implement the pop() function
	    	if ( q1.isEmpty()) {
	    		return -1 ;
	    	}
	    	while ( q1.size() != 1 ) {
	    		q2.add(q1.poll()) ;
	    	}
	    	int temp = q1.poll() ;
	    	while ( !q2.isEmpty()) {
	    		q1.add( q2.poll()) ;
	    	}
	    	size-- ;
	    	return temp ;
	    }

	    public int top() {
	        //Implement the top() function
	    	if ( q1.isEmpty()) {
	    		return -1 ;
	    	}
	    	while ( q1.size() != 1) {
	    		q2.add(q1.poll()) ;
	    	}
	    	int top = q1.poll() ;
	    	q2.add(q1.poll()) ;
	    	
	    	
	    	Queue<Integer> q = q1 ;
	    	q1 = q2 ;
	    	q2 = q ;
	    	return top ;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 _03_Stack_Using_Two_Queues<Integer> q = new _03_Stack_Using_Two_Queues<>() ;
		 for(int i = 1; i <= 5; i++){
			 q.push(i) ;
		 }
			while(! q.isEmpty()){
				
					System.out.println(q.pop());
				
			}
		 
	}

}
