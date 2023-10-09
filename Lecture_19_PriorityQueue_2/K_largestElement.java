package Lecture_19_PriorityQueue_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class K_largestElement {
	public static ArrayList<Integer>KLargest(int arr[] , int k){
		PriorityQueue<Integer>pq = new PriorityQueue<>() ;
//		PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder()) ;
		ArrayList<Integer>output = new ArrayList<>() ;
		for ( int i = 0 ; i < k ; i++) {
			pq.add(arr[i]) ;
		}
		for ( int i = k ; i < arr.length ; i++) {
			if (pq.peek() < arr[i]) {
				pq.remove() ;
				pq.add(arr[i]) ;
			}
		}
		while ( !pq.isEmpty()) {
			System.out.println(pq.peek());
			
			output.add(pq.remove()) ;
			
		}
		return output ;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,12, 9 ,16, 10, 5, 3 ,20, 25, 11, 1, 8, 6 } ;
		int k = 4 ;
		KLargest(arr, k) ;
	}

}
