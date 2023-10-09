package Lecture_19_PriorityQueue_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KsmallestElement {
	
	public static ArrayList<Integer>Ksmallest(int input[] , int k ){
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
		ArrayList<Integer> ans = new ArrayList<>() ;
		
		for ( int i = 0 ; i < k ; i++) {
			pq.add(input[i]) ;
		}
		for ( int i = k ; i < input.length ; i++){
			int check = pq.peek() ;
			if ( check > input[i]) { 
				pq.poll() ;
				pq.add(input[i]) ;
		}
		}
			while (!pq.isEmpty()) {
				System.out.println(pq.peek());
				ans.add(pq.poll()) ;
			}
			return ans ;
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,12, 9 ,16, 10, 5, 3 ,20, 25, 11, 1, 8, 6 } ;
		int k = 4 ;
		Ksmallest(arr, k) ;

	}

}
