package Lecture_12_ARRAYS_2D;

public class Print_SPIRAL {
	
	public static void spiralPrint(int matrix[][]){
		int rStart=0;
	    int rEnd=matrix.length-1;
	    int cStart=0;
	    int cEnd=matrix[0].length-1;
	    int counter=0;
	    while(counter<matrix.length*matrix[0].length){
	    
	    
	        for(int j=cStart;j<=cEnd;j++)
	        {
	            System.out.print(matrix[rStart][j]+" ");
	            counter++;
	        }

	    
	        rStart++;
	        for(int i=rStart;i<=rEnd;i++){
	            System.out.print(matrix[i][cEnd]+" ");
	            counter++;
	        }
	        cEnd--;
	        for(int i=cEnd;i>=cStart;i--)
	        {
	            System.out.print(matrix[rEnd][i]+" ");
	            counter++;
	           
	        }
	        rEnd--;
	        for(int i=rEnd;i>=rStart;i--)
	        {
	            System.out.print(matrix[i][cStart]+" ");
	            counter++;
	        }
	        cStart++;
	        
	            
	    
	}
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16} };
		spiralPrint(matrix) ;
	}
}
//		int rs = 0 ;
//		int cs = 0 ;
//		int re = matrix.length ;
//		int ce = matrix[0].length ;
////		System.out.println(re*ce);
//		int count = 0 ;
//		while (count < re * ce) {
//			for (int i = cs ; i < ce ; i++) {
//				int p = matrix[rs][i] ;
//				System.out.print(p + " ");
//				count++ ;
//			}rs++ ;
//			for ( int i = rs ; i < re ; i++) {
//				int p = matrix[i][ce] ;
//				System.out.print(p + " ");
//				count++ ;
//			}ce--;
//			for ( int i = ce ; i >cs ; i--) {
//				int p = matrix[re][i] ;
//				System.out.print(p + " ");
//				count++ ;
//			} re--;
//			for ( int i = re ; i > rs ; i--) {
//				int p = matrix[i][cs] ;
//				System.out.print(p + " ");
//				count++ ;
//			}cs++;
//		}
//
//	}
//
//}
//
////1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10


