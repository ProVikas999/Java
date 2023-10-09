package Lecture_22_Dynamic_Programming_2;

public class Minimum_Cost_Path {
    //	Through  RecurSion
//	public static int minCostPathR(int[][] input) {
//	}

	
	// Through Memoization and RecurSion
	public static int minCostPathM(int[][] input) {
		//Your code goes here
		int m = input.length ;
		int n = input[0].length ;

		int storage[][] = new int [m][n] ;
		for ( int i = 0 ; i<m ; i++){
			for ( int j = 0 ; j <n ;j++){
				storage[i][j] = -1 ;
			}
		}
		return minCostPathM(input , 0 ,0 , storage) ;
	}
	public static int minCostPathM(int[][] input , int i , int j , int storage[][] ) {
			int m = input.length ;
			int n = input[0].length ;

			if ( i >= m || j >= n){
				return Integer.MAX_VALUE ;
			}
			if ( i == m-1 && j == n-1){
				storage [m-1][n-1] = input[i][j] ;
			}
			if ( storage[i][j] != -1){
				return storage[i][j] ;
			}
			int o1 = minCostPathM(input, i, j+1, storage) ;
			int o2 = minCostPathM(input, i+1, j+1, storage) ;
			int o3 = minCostPathM(input, i+1, j, storage) ;

			storage[i][j] = input[i][j] + Math.min(o1, Math.min(o2, o3)) ;
			return storage[i][j] ;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int input[][] =  { {1,1,1}, {4,5,2} ,{7,8,9} } ;
	
	System.out.println(minCostPathM(input)) ;

	}

}
