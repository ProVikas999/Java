package Lecture_22_Graph_1;
import java.util.Scanner;
import java.util.ArrayList ;
import java.util.* ;

public class Get_Path_DFS {
	public static ArrayList GetpathDFS
	(int edges[][] , boolean visited[] ,int v1 ,int v2)
{
		if ( v1 == v2) {
			ArrayList<Integer> ans = new ArrayList<>() ;
			ans.add(v1) ;
			return ans ;
		}
		visited[v1] = true ;
		
		for ( int i = 0 ; i < edges.length ; i++) {
			if ( edges[v1][i] == 1 && !visited[i]) {
				ArrayList<Integer> arr = GetpathDFS(edges , visited ,i ,v2) ;
				if ( arr != null) {
					arr.add(v1) ;
					return arr ;
				}
			}
		}
		return null ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in) ;
		int v = s.nextInt() ;
		int e = s.nextInt() ;
		
		int edges[][] = new int [v][v] ;
		for ( int i = 0 ; i < e ; i++) {
			int sv = s.nextInt() ;
			int ev = s.nextInt() ;
			edges[sv][ev] = 1;
			edges[ev][sv] = 1 ;
		}
		int v1 = s.nextInt() ;
		int v2 = s.nextInt() ;
		
		boolean visited[] = new boolean[edges.length] ;
		ArrayList<Integer> arr = GetpathDFS(edges , visited , v1 ,v2) ;
		if ( arr != null) {
			for ( int i : arr) {
				System.out.print(i + " ") ;
			}
		}
	}

}
