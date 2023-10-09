package Lecture_22_Graph_1;
import java.util.Scanner ;

public class DepthFirstSerarch {
	public static void PrintDFS(int edges[][]) {
		boolean visited[] = new boolean[edges.length] ;
		for ( int i = 0 ; i < edges.length ; i++) {
			if ( !visited[i]) {
				 PrintDFSHelper(edges ,i ,visited) ;
			}
		}
	}
	public static void PrintDFSHelper(int edges[][] ,int sv , boolean visited[]) {
		System.out.println(sv) ;
		visited[sv]  = true ;
		
		int n = edges.length ;
		for ( int i = 0 ; i <n ; i++) {
			if ( edges[sv][i] == 1 && !visited[i]) {
				PrintDFSHelper(edges,i,visited) ;
				
				
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		int n = s.nextInt() ;
		int e = s.nextInt() ;
		int edges[][] = new int [n][n] ;
		for ( int i = 0 ; i < e ; i++) {
			int fv = s.nextInt() ;
			int sv = s.nextInt() ;
			edges[fv][sv] = 1 ;
			edges[sv][fv] = 1 ;
		}
		PrintDFS(edges) ;
	}

}
