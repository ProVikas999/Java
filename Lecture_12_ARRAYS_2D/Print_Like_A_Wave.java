package Lecture_12_ARRAYS_2D;

public class Print_Like_A_Wave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16} };

		int row = mat.length ;
		int col = mat[0].length ;
		
		for ( int j = 0 ; j < col ; j++) {
			if (j%2 == 0) {
				for (int i = 0 ; i < row ;i++) {
					int p = mat[i][j] ;
					System.out.print(p + " ");
				}
			}
				else {
					for (int i = row-1 ; i >= 0 ;i--) {
						int p = mat[i][j] ;
						System.out.print(p + " ");
				}
			}
		}
	}
}
