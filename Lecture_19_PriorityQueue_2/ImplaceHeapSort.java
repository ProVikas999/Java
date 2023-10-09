package Lecture_19_PriorityQueue_2;

public class ImplaceHeapSort {
	
	public static void InsertIntoVirtualHeap (int arr[] , int i) {
		int childIndex =  i ;
		int ParentIndex =  (childIndex-1)/2 ;
		
		while ( childIndex > 0) {
			if ( arr[childIndex] < arr[ParentIndex]) {
				int temp = arr[childIndex] ;
				arr[childIndex] = arr[ParentIndex] ;
				arr[ParentIndex] = temp ;
				childIndex = ParentIndex ;
				ParentIndex =  (childIndex-1)/2 ;
			}
			else {
				return ;
			}
		}
	}
	public static int removeMinfromVirtualHeap ( int arr[] , int HeapSize) {
		int temp = arr[0] ;
		arr[0] = arr[HeapSize-1] ;
		HeapSize-- ;
		int index = 0 ;
		int leftchildIndex = 2*index + 1 ;
		int rightchildIndex = 2*index + 2 ;
		while ( leftchildIndex < HeapSize) {
			int MinIndex = index ;
			if (arr[leftchildIndex] < arr[MinIndex]) {
				MinIndex = leftchildIndex ;
				
			}
			if ( rightchildIndex < HeapSize && arr[rightchildIndex ] < arr[MinIndex]) {
				MinIndex = rightchildIndex ;
			}
			if ( MinIndex != index) {
				int temp1 = arr[index] ;
				arr[index ] = arr[MinIndex] ;
				arr[MinIndex] = temp1 ;
				index = MinIndex ;
				leftchildIndex = 2*index + 1 ;
			    rightchildIndex = 2*index + 2 ;
			}
			else {
				break ;
			}
			
		}
		return temp ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,1,9,2,0,6} ;
		for ( int i= 0 ;i < arr.length ; i++) {
			InsertIntoVirtualHeap(arr, i);
		}
		for (int i= 0 ;i < arr.length ; i++) {
			arr[arr.length-1-i] = removeMinfromVirtualHeap(arr, arr.length-i) ;
		}
		for (int i= 0 ;i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	
	
	
}
