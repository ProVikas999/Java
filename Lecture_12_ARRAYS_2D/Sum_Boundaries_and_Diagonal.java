package Lecture_12_ARRAYS_2D;

public class Sum_Boundaries_and_Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16} };
		int mat[][] = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}} ;
		int sum = 0 ;
		int n = mat.length ;
		for (int i = 0 ; i<n ; i++) {
			sum = sum + mat[0][i] ;
			sum = sum + mat[n-1][i] ;
		}
		for (int i = 1 ; i < n-1 ; i++) {
			sum = sum + mat[i][0];
			sum = sum + mat[i][n-1] ;
		}
		for ( int i = 1 ; i < n-1 ; i++) {
			sum = sum + mat[i][i] ;
			sum = sum + mat[i][n-1-i] ;
		}
		if (n%2!=0) {
			sum = sum - mat[n/2][n/2] ;
		}
	System.out.println(sum);

	}

}
