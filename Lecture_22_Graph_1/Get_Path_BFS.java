package Lecture_22_Graph_1;

import java.util.Scanner;
import java.util.LinkedList ;
import java.util.ArrayList ;
import java.util.HashMap ;
import java.util.Queue;


public class Get_Path_BFS {
	
	public static ArrayList GetpathBFS
	(int edges[][] , boolean visited[] ,int v1 ,int v2)
{
			  if ( v1 == v2){
				ArrayList<Integer> ans = new ArrayList<>() ;
				ans.add(v1) ;
				return ans ;
			}
	        Queue<Integer> q = new LinkedList<>() ;
	        HashMap<Integer,Integer> map = new HashMap<>() ;
	        ArrayList<Integer> ans = new ArrayList<>() ;

	        q.add(v1) ;
	        visited[v1] = true ;
	        while ( !q.isEmpty()){
	            int front = q.remove() ;

	            for ( int i = 0 ; i < edges.length ;i++){
	                if ( edges[front][i] == 1 && !visited[i]){
	                    visited[i] = true ;
	                    q.add(i) ;
	                    map.put(i, front) ;
	                    if ( i == v2){
	                        ans.add(i) ;
	                        while ( !ans.contains(v1)){
	                            int b = map.get(i) ;
	                            ans.add(b) ;
	                            i = b ;
	                        }
	                        return ans  ;
	                    }
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
		ArrayList<Integer> arr = GetpathBFS(edges , visited , v1 ,v2) ;
		if ( arr != null) {
			for ( int i : arr) {
				System.out.print(i + " ") ;
			}
		}
	}

	}


