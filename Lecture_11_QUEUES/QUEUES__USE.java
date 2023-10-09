package Lecture_11_QUEUES;

public class QUEUES__USE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		_01_Queue_Using_Array queue = new _01_Queue_Using_Array(3) ;
		_02_Queue_using_LinkedList<Integer> queue= new _02_Queue_using_LinkedList<Integer>() ;
		for(int i = 1; i <= 50; i++){
//			try {
				queue.enqueue(i);
//			}
//			catch (QueueFullException e) {
//				// TODO Auto-generated catch block
//			
//			}
		}
		
		
		while(! queue.isEmpty()){
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
