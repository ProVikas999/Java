package Lecture_18_PriorityQueue_1;
import java.util.ArrayList ;
import java.util.HashMap;


//    Min Priority Queue 
//         and
//    Max Priority Queue
public class PriorityQueue {
	
	private ArrayList<Integer> heap ;
	
	public PriorityQueue() {
		heap = new ArrayList<>() ;
	}
	boolean isEmpty() {
		return heap.size()==0 ;
	}
	int size () {
		return heap.size() ;
	}
	int getMin() throws PriorityQueueEmptyException {
		if ( isEmpty()) {
			throw new PriorityQueueEmptyException() ;
		}
		return heap.get(0) ;
	}
	void insertMin (int element) {
	heap.add(element) ;
	int childIndex = heap.size()-1 ;
	int ParentIndex = (childIndex-1)/2 ;
	while ( childIndex > 0) {
		if ( heap.get(childIndex) < heap.get(ParentIndex)) {
			int temp = heap.get(childIndex) ;
			heap.set(childIndex, heap.get(ParentIndex)) ;
			heap.set(ParentIndex, temp) ;
			childIndex = ParentIndex ;
			ParentIndex = (childIndex-1)/2 ;
 		}
		else {
			return ;
		}
	}
	}
	void insertMax ( int element) {
		heap.add(element) ;
		int childIndex = heap.size() -1 ;
		int ParentIndex = (childIndex - 1) / 2 ;

		while ( childIndex > 0){
			if ( heap.get(childIndex) > heap.get(ParentIndex) ) {
				int temp = heap.get(ParentIndex) ;
				heap.set(ParentIndex, heap.get(childIndex)) ;
				heap.set(childIndex,temp) ;
				childIndex = ParentIndex ;
				ParentIndex = (childIndex-1)/2 ;
			}
		
			else {
				return ;	
		}
	}
	}
	int removeMin() throws PriorityQueueEmptyException {
		if ( isEmpty()) {
			throw new PriorityQueueEmptyException() ;
		}
		int temp = heap.get(0) ;
		heap.set(0, heap.get(heap.size()-1)) ;
		heap.remove(heap.size()-1) ;
		
		int index = 0 ;
		int minIndex = index ;
		int leftChildIndex = 2*index +1 ;
		int rightChildIndex = 2*index + 2 ;
		
		while (leftChildIndex < heap.size()) {
			if ( heap.get(leftChildIndex) < heap.get(minIndex)) {
				minIndex = index ;
			}
			if ( rightChildIndex < heap.size() && heap.get(rightChildIndex)< heap.get(minIndex)) {
				minIndex = rightChildIndex ;
			}
			if ( minIndex != index) {
				int temp1 = heap.get( index) ;
				heap.set(index, heap.get(minIndex)) ;
				heap.set(minIndex, temp1) ;
				index = minIndex ;
				 leftChildIndex = 2*index +1 ;
				 rightChildIndex = 2*index + 2 ;
			}
			else {
				break ;
			}
		}
		return temp ;
	}
	int removeMax() throws PriorityQueueEmptyException {
		if ( isEmpty()) {
			throw new PriorityQueueEmptyException() ;
		}
		int temp = heap.get(0) ;
		heap.set(0, heap.get(heap.size()-1)) ;
		heap.remove(heap.size()-1) ;
		
		int index = 0 ;
		int maxIndex = index ;
		int leftChildIndex = 2*index +1 ;
		int rightChildIndex = 2*index + 2 ;
		
		while (leftChildIndex < heap.size()) {
			if ( heap.get(leftChildIndex) > heap.get(maxIndex)) {
				maxIndex = leftChildIndex ;
			}
			if ( rightChildIndex < heap.size() && heap.get(rightChildIndex)> heap.get(maxIndex)) {
				maxIndex = rightChildIndex ;
			}
			if ( maxIndex != index) {
				int temp1 = heap.get( index) ;
				heap.set(index, heap.get(maxIndex)) ;
				heap.set(maxIndex, temp1) ;
				index = maxIndex ;
				 leftChildIndex = 2*index +1 ;
				 rightChildIndex = 2*index + 2 ;
			}
			else {
				break ;
			}
		}
		return temp ;
	}
	
	public static void main(String[] args) throws PriorityQueueEmptyException {
		
	

			PriorityQueue pq = new PriorityQueue();
			int arr[] = {5,1,9,2,10,6} ;
			for(int i = 0; i < arr.length; i++){
				pq.insertMin(arr[i]);
			}
			
			while(! pq.isEmpty()){
				System.out.print(pq.removeMin() + " ");
			}
			System.out.println();
			
	}
	
	
	

}
