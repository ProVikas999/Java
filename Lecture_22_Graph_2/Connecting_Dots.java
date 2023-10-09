package Lecture_22_Graph_2;

public class Connecting_Dots {
	  int solve(String[] board , int n, int m)
		{
			/* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
	        */
			boolean [][]visited = new boolean[n][m] ;
			for ( int i = 0 ; i< n ; i++){
				for ( int j = 0 ; j< m ; j++){
					if (!visited[i][j]){
						int ans = hasCycle (board , -1,-1,i,j,visited) ;
						if (ans == 1){
							return 1 ;
						}
					}
				}
			}
			return 0 ;
		}

		public static int hasCycle(String[] board , int x1 , int y1 ,int i , int j , boolean[][] visited){

			if ( visited[i][j] ){
				return 1 ;
			}
			int []x_dir = {1,0,0,-1} ;
			int []y_dir = {0,1,-1,0} ;
			visited[i][j] = true ;

			for ( int k = 0 ; k < x_dir.length ; k++){
				int x = i + x_dir[k] ;
				int y = j + y_dir[k] ;
				if ( x == x1 && y == y1){
					continue ;
				}
				if ( x>= 0 && y >= 0 && x< board.length && 
				y< board[x].length() && board[x].charAt(y) == board[i].charAt(j)) {

					int smallans = hasCycle(board ,i,j,x,y,visited) ;
					if ( smallans == 1){
						return 1 ;
					}

				}
			}
			return 0 ;


		}
		


}
