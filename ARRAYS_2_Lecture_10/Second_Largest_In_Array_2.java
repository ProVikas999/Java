package ARRAYS_2_Lecture_10;

public class Second_Largest_In_Array_2 {
	public static void SecondLargest (int arr[]) {    
		  int L = Integer.MIN_VALUE ;
	        int SL =  Integer.MIN_VALUE;
	        int n = arr.length ;

	        for ( int i = 0 ; i < n ;i ++){
	        	if ( arr[i] > L) {
	        		SL = L ;
	        		L = arr[i] ;
	        	}
	        	else if ( arr[i] > SL && arr[i] != L) {
	        		SL = arr[i] ;
	        	}
	        
	} System.out.println(SL);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,90,9,1,72,5,5,10,1,0,7};
		SecondLargest(arr) ;
	}

}
