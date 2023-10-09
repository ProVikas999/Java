package ARRAYS;

public class Pair_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		int sum = 7;
		int count = 0;
		for (int i = 0 ; i<arr.length-1; i++) {
			for (int j = i+1 ; j<arr.length ; j++) {
				if (arr[i] + arr[j] == sum) {
					count++;
				}
			}
		} System.out.println(count);

	}

}
