package Lecture_22_Graph_1;

import java.util.Scanner;
import java.util.Queue ;
import java.util.LinkedList ;


public class Has_Path {
	
	public static void hasPath
	(int edges[][] , int v1 , int v2 ,boolean visited[]) 
	{
		Queue<Integer> q = new LinkedList<>() ;
		q.add(v1) ;
		int n = edges.length ;
		
		while ( !q.isEmpty()) {
			int front = q.remove() ;
			visited[front] = true ;
			
		if ( front == v2) {
			System.out.print("true") ;
			return ;
		}
		for ( int i = 0 ; i < n ;i++) {
			if ( edges[front][i] == 1 && !visited[i]) {
				visited[i] = true ;
				q.add(i) ;
			}
		}
		}
		System.out.println("false") ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		int v = s.nextInt() ;
		int e = s.nextInt() ;
		if ( v == 0 && e == 0) {
			System.out.println("true");
			return ;
		}
		int edges [][] = new int [v][v] ;
		for ( int i = 0 ; i < e ; i++ ) {
			int fv = s.nextInt() ;
			int sv = s.nextInt() ;
			edges[fv][sv] = 1 ;
			edges[sv][fv] = 1 ;
		}
		int v1 = s.nextInt() ;
		int v2 = s.nextInt() ;

		boolean visited[] = new boolean[edges.length] ;

		hasPath(edges, v1, v2, visited);
		
	}

}
