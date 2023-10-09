package Lecture_11_QUEUES;
import java.util.* ; 

public class _05_Reverse_queue<T> {

	public static void reverseQueue(Queue<Integer> input) {
		if ( input.size() == 0 || input.size() == 1) {
			return ;
		}
		int temp = input.poll() ;
		reverseQueue(input); 
		input.add(temp) ;
		return ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		_05_Reverse_queue<Integer> q = new _05_Reverse_queue<>() ;
		Queue<Integer> q = new LinkedList<Integer>();
		
		for ( int i = 1 ; i <= 5; i++) {
			q.add(i*10) ;
		}
		reverseQueue(q);
		while ( !q .isEmpty()) {
			System.out.println(q.peek());
			q.poll() ;
		}


}
}
