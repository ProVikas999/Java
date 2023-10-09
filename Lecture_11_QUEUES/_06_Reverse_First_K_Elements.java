package Lecture_11_QUEUES;
import java.util.*;

public class _06_Reverse_First_K_Elements<T> {
	public static Queue<Integer>ReversekElements(Queue<Integer>input , int k ){
		if ( k <= 1) {
			return input;
		}
		if ( input.size() == 0 || input.size() == 1) {
			return input ;
		}
		Stack<Integer> s = new Stack<>() ;
		
		int n = input.size() ;
		for ( int i = 0 ; i < k ; i++) {
			s.push(input.peek()) ;
			input.poll() ;
		}
		while (!s.isEmpty()) {
			input.add(s.pop()) ;
		}
		for ( int i = 0 ; i < n-k ; i++) {
			input.add(input.peek()) ;
			input.poll() ;
		}
		return input ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		_06_Reverse_First_K_Elements<Integer> q = new _06_Reverse_First_K_Elements<>() ;
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1 ; i <= 5 ; i++) {
			
		
		    q.add(i*10);
	       
	}
	 
	        int k = 3;
	 
	        // function call.
	        ReversekElements(q, k);
	 
	        while (!q.isEmpty()) {
	            System.out.println(q.peek() );
	            q.poll();
	        }
	        
		

	}

}
