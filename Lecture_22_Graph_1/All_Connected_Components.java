package Lecture_22_Graph_1;
import java.util.* ;


public class All_Connected_Components {
	
	public static void DFS 
	( int edges[][] , boolean visited[] , int start , ArrayList<Integer>arr)
	{
		visited[start] = true ;
		arr.add(start) ;
		int n = edges.length ;
		for ( int i = 0 ;i < n ;i++) {
			if ( edges[start][i] == 1 && !visited[i]) {
				visited[i] = true ;
				DFS(edges, visited, i, arr);
			}
		}
		
	}
	public static void AllConnectedComponents(int edges[][]) {
		boolean visited[] = new boolean[edges.length] ;
		
		for ( int i = 0 ; i < edges.length ; i++) {
			if (!visited[i]) {
				ArrayList<Integer> arr = new ArrayList<>() ;
				DFS(edges, visited, i, arr);
				Collections.sort(arr);
				for (int j = 0 ; j < arr.size() ;j++) {
					System.out.print(arr.get(j) + " ");
				}
				System.out.println();
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		int v = s.nextInt() ;
		int e = s.nextInt() ;
		int edges [][] = new int [v][v] ;
		for ( int i = 0 ; i < e ; i++ ) {
			int fv = s.nextInt() ;
			int sv = s.nextInt() ;
			edges[fv][sv] = 1 ;
			edges[sv][fv] = 1 ;
			
		}
		AllConnectedComponents(edges);
		

	}

}
