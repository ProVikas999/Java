package Lecture_22_Graph_2;

public class CodingNinjas {
	int solve(String[] Graph, int N, int M) {
		
        // Initialize the string to search
        String searchingString = "CODINGNINJA";
        
        // Create a 2D array to track visited cells
		boolean[][] visited = new boolean[N][M];
		// for(int i=0; i<N; i++) { //Graph.length gives the number of rows, Graph[i].length gives the number of columns per row
		// 	visited[i] = new boolean[M];
		// }

		// Iterate over each cell in the graph
		for(int i=0; i<Graph.length; i++) {
			for(int j=0; j<Graph[i].length(); j++) {
				// Check if the current cell contains 'C'
				if(Graph[i].charAt(j) == 'C') {
					// Call the dfs function to search for the remaining characters in the string
					boolean ans = dfs(Graph, visited, searchingString.substring(1), i, j);
					if(ans) {
						// If a path is found, return 1
						return 1;
					}
				}
			}
		}
		// If no path is found, return 0
		return 0;
	}
	
    public static boolean dfs(String[] graph, boolean[][] visited, String searchString, int i, int j) {

		// Base case: If the searchString is empty, we have found the complete path
		if(searchString.length() == 0) {
			visited[i][j] = true;
			return true;
		}

		visited[i][j] = true;
		
		// To traverse in 8 different directions (up, down, left, right, and diagonals)
		int[] X_Dir = {-1, 1, 0, 0, 1, -1, 1, -1};
		int[] Y_Dir = {0, 0, -1, 1, 1, -1, -1, 1};

		// Explore each direction
		for(int k=0; k<X_Dir.length; k++) {
			int x = i + X_Dir[k];
			int y = j + Y_Dir[k];

			// Check if the new position (x, y) is within the boundaries of the graph,
			// if the character at that position matches the next character in the searchString,
			// and if the cell has not been visited before
			if(x >= 0 && y >= 0 && x < graph.length && y < graph[x].length() && 
				graph[x].charAt(y) == searchString.charAt(0) && !visited[x][y]) {

				// Recursively call dfs with the updated searchString and new position (x, y)
				boolean smallAns = dfs(graph, visited, searchString.substring(1), x, y);
				if(smallAns) {
					// If a path is found, return true
					return smallAns;
				}
			}
		}
		
		// Mark the current cell as not visited and return false
		visited[i][j] = false;
		return false;
	}

}
