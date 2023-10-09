package Recursion_1_Lecture_03;

public class Geometric_Sum {
	public static double findGeometricSum(int k) {
		if ( k == 0) {
			return 1 ;
		}
		return findGeometricSum(k-1)  + 1 / 
				
				Math.pow(2, k) ; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 4 ;
		System.out.println(findGeometricSum(k));
		

	}

}
