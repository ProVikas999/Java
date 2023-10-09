package ARRAYS_2_Lecture_10;

public class Binary_Search {
	public static void main(String[] args) {
		int arr[] = {1,3,7,9,11,12,45 };
		int x = 12 ;  // search in array
		int start = 0;
		int end = arr.length-1;
		int mid;
		
		while (start <= end ) {
			 mid = (start + end) / 2 ;
			if (arr[mid] == x) {
				System.out.println(mid);
			}
			if (arr[mid] < x) {
				start  = mid + 1;
			}
			else {
				end = mid - 1 ;
			}
//			System.out.println(mid); 
			
			
			
		}
		}

}
