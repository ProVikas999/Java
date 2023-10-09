package Lecture_12_ARRAYS_2D;

public class Largest_Row_Or_Column {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16} };
		if ( mat.length ==  0){
			int idx = 0 ;
			System.out.print("row " + idx +" " + Integer.MIN_VALUE);
			return ;
		}
		//Your code goes here
		int maxrow  = Integer.MIN_VALUE ;
		int rowindex = 0 ;
			int sumR ;
		int row = mat.length ;
		int col = mat[0].length ;
		for ( int i = 0 ; i < row ; i++){
			sumR = 0 ;
			for (int j = 0 ; j < col ; j++){
				sumR = sumR + mat[i][j] ;
			}
			 if ( sumR > maxrow){
				maxrow = sumR ;
				rowindex = i ;
			
			}

		}   
		    int sumC ;
			int colindex = 0 ;
			int maxcol = Integer.MIN_VALUE ;
			for ( int j = 0 ; j < col ; j++){
				sumC = 0 ;
			for (int i = 0 ; i < row ; i++){
				sumC = sumC + mat[i][j] ;
			} if ( sumC > maxcol){
				maxcol = sumC ;
				colindex = j ;
				
			}
			

		}
		
		if (maxrow >= maxcol) {
			  System.out.print("row "+rowindex+" "+ maxrow);
		}
		 else	{
			System.out.print("column "+colindex+" "+ maxcol);
			  }

	}

}
