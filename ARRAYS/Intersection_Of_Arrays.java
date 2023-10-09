package ARRAYS;

public class Intersection_Of_Arrays {
	public static void commonInarray(int arr1[] , int arr2[]) {
		for (int i = 0 ; i < arr1.length ; i++) {
			for(int j = 0 ; j < arr2.length ; j++) {
				if (arr1[i] == arr2[j]) {
					
					System.out.print(arr1[i] + " ");
					arr2[j] = Integer.MIN_VALUE;
					break ;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6,100,2,2,9};
		int arr2[] = {2,2,2,2,3,6,9,7,9,5,3,100,5};
		
		commonInarray(arr1 , arr2);
		
	
	}

}
