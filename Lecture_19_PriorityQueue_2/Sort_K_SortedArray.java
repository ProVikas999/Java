package Lecture_19_PriorityQueue_2;
import java.util.PriorityQueue;

public class Sort_K_SortedArray {
	
	public static void Sort_K_sorted_arr(int arr[] , int k) {
		PriorityQueue<Integer> Pq = new PriorityQueue<>() ;
		for ( int i = 0 ; i < k ; i++) {
			Pq.add(arr[i]) ;
		}
		for ( int i = k ; i < arr.length ; i++) {
			arr[i-k] = Pq.remove() ;
		}
		for ( int j = arr.length - k ; j < arr.length ; j++) {
			arr[j] = Pq.remove() ;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,1,9,6,8} ; 
		int k = 3 ;
		Sort_K_sorted_arr(arr, k);
		for ( int i : arr) {
			System.out.print(arr[i] + " ");
		}
 
	}

}
