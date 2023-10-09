package Lecture_19_PriorityQueue_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Assignments {
	public static boolean checkMaxHeap(int arr[]) {
		 for ( int i = 0 ; i < arr.length ; i++){
			 int root = arr[i] ;
			 int leftchild = (2*i) + 1 ;
			 int rightchild = (2*i) + 2 ;

				 if (  leftchild < arr.length && root < arr[leftchild] ){
					 return false;
				 }
				 if ( rightchild <  arr.length && root < arr[rightchild] ){
					 return false ;
				 }	
		 }
		 return true ; 
	}

	public static int kthLargest(int n, int[] input, int k) {
		// Write your code here
		PriorityQueue<Integer> pq = new PriorityQueue<>() ;

		// if ( input.length == 0){
		// 	return -1 ;

		
		// }
		for ( int i = 0 ; i < k ; i++){
			pq.add(input[i]) ;
		}
		for ( int i = k ; i < input.length ; i++){
			if (pq.peek() < input[i]){
				pq.poll() ;
				pq.add(input[i]) ;
			}
		}
		return pq.poll() ;

	}

    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {

		
		ArrayList<Integer> output = new ArrayList<>() ;
		PriorityQueue<Integer> pq = new PriorityQueue<>() ;

		for ( int i = 0 ; i < input.size() ; i++){
			ArrayList<Integer> x = input.get(i);
			for(int j=0;j<x.size();j++){
				pq.add(x.get(j));
			}
		}
		
		while ( !pq.isEmpty()){
			output.add(pq.poll()) ;
		}

		return output;

	}

    public static void findMedian(int arr[])  {
		PriorityQueue<Integer>Min = new PriorityQueue<>() ;
		PriorityQueue<Integer>Max = new PriorityQueue<>(Collections.reverseOrder()) ;

		for ( int i = 0 ; i < arr.length ; i++){
			if ( Max.isEmpty()){
				Max.add(arr[i]) ;
			}
			else if (arr[i] > Max.peek()){
				Min.add(arr[i]) ;

				if (Min.size() - Max.size() > 1){
					Max.add(Min.remove()) ;
				}
			}
				else {
					Max.add(arr[i]) ;
					if (Max.size() - Min.size() >1){
							Min.add(Max.remove()) ;
					}
				}
				if (Max.size() > Min.size()){
					System.out.print(Max.peek() + " ");
				}
				else if (Min.size() > Max.size() ){
					System.out.print(Min.peek() + " ");
				}
				else {
					System.out.print((Max.peek() + Min.peek())/2 + " ");
				}
			}
		}

    public static int buyTicket(int input[], int k) {

        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for ( int i = 0 ; i < input.length ; i++){
            queue.add(i) ;
            pq.add(input[i]) ;
        }
        int timeCount = 0 ;

        while (! queue.isEmpty()){
            if ( input[queue.peek()] < pq.peek()){
                 queue.add(queue.poll()) ;
            }
            else {
                  pq.remove() ;
                timeCount++;
                if (queue.poll() == k){ 
                    // break ;
                    return timeCount ;
                }
            }
        }
        return timeCount ;

    }

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 