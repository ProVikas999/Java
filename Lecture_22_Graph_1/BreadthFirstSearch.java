package Lecture_22_Graph_1;

import java.util.Scanner;
import java.util.Queue ;
import java.util.LinkedList ;


public class BreadthFirstSearch {

	public static void PrintBFS(int edges[][]) {
		boolean visited[] = new boolean[edges.length] ;
		for ( int i = 0 ; i < edges.length ; i++) {
			if ( !visited[i]) {
				 PrintBFSHelper(edges ,i ,visited) ;
			}
		}
	}
	public static void PrintBFSHelper(int edges[][] ,int sv , boolean visited[]) {
		Queue<Integer> q = new LinkedList<Integer>() ;
		q.add(sv) ;
		int n = edges.length ;
		visited[sv] = true ;
		while (!q.isEmpty()) {
			int front = q.remove() ;
			System.out.println(front) ;
			for ( int i = 0 ; i < n ; i++) {
				if ( edges[front][i] == 1 && !visited[i]) {
					q.add(i) ;
					visited[i] = true ;
				}
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
		PrintBFS(edges) ;
	}

}
