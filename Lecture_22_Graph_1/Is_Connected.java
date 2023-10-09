package Lecture_22_Graph_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Is_Connected {
	
	public static boolean isConnected(int edges[][]) {
		boolean visited [] = new boolean[edges.length] ;
		DFS(edges, visited, 0);
		for ( int i = 0 ; i < visited.length ; i++) {
			if ( visited[i] == false ) {
				return false ;
			}
		}
		return true ;
	}
	
	
	public static void DFS(int edges[][] , boolean visited[] , int start ){
		visited[start] = true ;
		int n = edges.length ;
		for ( int i = 0 ;i < n ;i++) {
			if ( edges[start][i] == 1 && !visited[i]) {
				visited[i] = true ;
				DFS(edges, visited, i);
			}
		}
		
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
		boolean ans = isConnected(edges ) ;
		System.out.println(ans);

	}

}
