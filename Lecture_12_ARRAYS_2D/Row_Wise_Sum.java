package Lecture_12_ARRAYS_2D;

public class Row_Wise_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16} };
		int sum = 0;
		int row = mat.length ;
		int col = mat[0].length ;
		
		for (int i = 0 ; i< row ; i++) {
			for (int j = 0 ; j< col ; j++) {
				sum = sum + mat[i][j] ;
			}System.out.print(sum );
			System.out.println();
		}

	}

}
