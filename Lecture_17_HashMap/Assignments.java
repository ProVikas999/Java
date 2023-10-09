    package Lecture_17_HashMap;
    
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.HashSet;


    public class Assignments {
	
	public static int PairSumToZERO(int[] input) {
		HashMap<Integer, Integer> map = new HashMap<>() ;
		
		int count = 0 ;
		for ( int i : input) {
			int complement = -i ;
			
			if (map.containsKey(complement)) {
				count = count + map.get(complement) ;
				System.out.println(i + " " + complement);
			}
			map.put(i, map.getOrDefault(i,0) + 1) ;
		}
		return count ;
	}

	public static int MaxFrequencyNum (int input[]) {
		HashMap<Integer, Integer> ans = new HashMap<>() ;
		for ( int i = 0 ; i < input.length ; i++) {
			if ( ans.containsKey(input[i]) ){
				ans.put(input[i], ans.get(input[i]) + 1) ;
			}
			else {
				ans.put(input[i], 1) ;
			}
		}
			int max = 0 ;
			int maxKey = Integer.MIN_VALUE ;
			
			for ( int i = 0 ; i < input.length ; i++) {
				
				if (ans.get(input[i]) > max ) {
					max = ans.get(input[i]) ;
					maxKey = input[i] ;
				}
			}
			return maxKey ;
			
			
		}
 	
	public static ArrayList<Integer> removeDuplicates (int input[]) {
		
		ArrayList<Integer> output = new ArrayList<>() ;
		HashMap<Integer, Boolean> check = new HashMap<>() ;
		
		for ( int i = 0 ; i < input.length ; i++) {
			if ( check.containsKey(input[i])) {
				continue ;
			}
			else {
				output.add(input[i]) ;
				check.put(input[i], true) ;
			}
		}
		return output ;
	}
	
	public static void printIntersection(int[] arr1,int[] arr2){
		if (arr1.length == 0 || arr2.length == 0) {
			return ;
		}
		
		HashMap<Integer, Integer> ansArr = new HashMap<>() ;
		for ( int i = 0 ; i < arr1.length ; i++){
			if ( ansArr.containsKey(arr1[i])){
					ansArr.put(arr1[i], ansArr.get(arr1[i]) +1  ) ;
			}
			else {
				ansArr.put(arr1[i], 1) ;
			}
		}
		for ( int i = 0 ; i <arr2.length ; i++){
			if ( ansArr.containsKey(arr2[i]) ) {
				if ( ansArr.get(arr2[i]) !=0){
				System.out.println(arr2[i] );
				ansArr.put(arr2[i], ansArr.get(arr2[i]) - 1 ) ;
			}
			}
		}
	}
	
	public static String ExtractUniquecharacter (String str ) {
		
		HashMap<Character, Boolean> map = new HashMap<>() ;
		String ans = "" ;
		
		for ( int i = 0 ; i < str.length() ; i++) {
			if ( map.containsKey(str.charAt(i))) {
				continue ;
			}
			else {
				ans = ans + str.charAt(i) ;
				map.put(str.charAt(i), true ) ;
				
			 }
		}
		return ans ;
		
	}
	
	public static int pairWithKdifferences(int arr[] , int k) {
		
		HashMap<Integer, Integer> map = new HashMap<>() ;
		int pairs = 0 ;
		for ( int i : arr) {
			int toLookFor1 = k + arr[i] ;
			int toLookFor2 = arr[i] - k ;
			
			if ( map.containsKey(toLookFor1)) {
				pairs = pairs + map.get(toLookFor1) ;
			}
			if ( toLookFor1 != toLookFor2) { // for K = 0 
				if (map.containsKey(toLookFor2)) {
					pairs = pairs + map.get(toLookFor2) ;
				}
			}
			if ( map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1) ;
			}
			else {
				map.put(arr[i], 1) ;
			}
		}
		return pairs ;
	}
	
	public static int lengthofLongestSubsetofZeroSum (int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<>() ;
		int sum = 0 ;
		int maxlen = -1 ;
		for ( int i : arr) {
			sum = sum + arr[i] ;
			if ( sum == 0) {
				maxlen = i+1 ;
			}
			if ( map.containsKey(sum)) {
				int prevIndex = map.get(sum) ;
				int currLen = i - prevIndex ;
				if ( currLen > maxlen) {
					maxlen = currLen ;
				}
				else {
					map.put(sum, i) ;
				}
			}
		}
		return maxlen ;
	}

	public static ArrayList<Integer> longestConsecutiveSequence(int arr[]){
		
		HashMap<Integer, Boolean> map = new HashMap<>() ;
		ArrayList<Integer> output = new ArrayList<>() ;
		
		for ( int i : arr) {
			map.put(arr[i], true ) ;
		}
		int maxlength = 0 ;
		int start = 0 ;
		
		for ( int i : arr) {
			if ( map.get(arr[i])) {
				int length = 0 ;
				int temp1 = arr[i] ;
				
				while (map.containsKey(temp1)) {
					length++ ;
					map.put(arr[i], false) ;
					temp1++ ;
				}
				int temp2 = arr[i] ;
				int temp3 = arr[i] - 1 ;
				
				while ( map.containsKey(temp3)) {
					length++ ;
					map.put(temp3, false) ;
					temp2 = temp3 ;
					temp3-- ;
				}
				if ( length >= maxlength) {
					maxlength = length ;
					start = temp2 ;
				}
				for ( int j = 0 ; j < arr.length ; j++) {
					if ( arr[j] == temp2) {
						start = temp2 ;
						break ;
					}
					else if (arr[j] == temp2) {
						start = temp2 ;
					}
					
					
				}
			}
			
				else  {
					continue ;
				}
				output.add(start) ;
				output.add(start + maxlength -1 ) ;
			}
			return output ;
		}
		// 2nd approach
	  public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
	        HashSet<Integer> set = new HashSet<>();
	        for (int num : arr) {
	            set.add(num);
	        }

	        int maxLength = 0;
	        int start = -1;

	        for (int num : arr) {
	            if ( !set.contains(num - 1)) {
	                int currentNum = num;
	                int currentLength = 1;

	                while (set.contains(currentNum + 1)) {
	                    currentNum++;
	                    currentLength++;
	                }

	                if (currentLength > maxLength) {
	                    maxLength = currentLength;
	                    start = num;
	                }
	            }
	        }

	        ArrayList<Integer> output = new ArrayList<>();
	        output.add(start);
	        if (maxLength > 1) {
	            output.add(start + maxLength - 1);
	        }
	        return output;
	    }

	
  	public static void main(String[] args) {
	
		int input[] = {1,2,3,4,5,-5,-4,-3,-1,-2 ,2,6,8,7,2,5,2,1,1,2,2} ;
		
		int count  = PairSumToZERO(input) ;
		System.out.println("number of pairs which sums to zero = " + count);
		System.out.println();
		
		int maxfrequencynum = MaxFrequencyNum(input ) ;
		System.out.println("max freq num = " + maxfrequencynum);
		System.out.println();
		
		ArrayList<Integer> ans = removeDuplicates(input) ;
		for ( int i = 0 ; i < ans.size() ; i++) {
			System.out.println(ans.get(i));
		}
		System.out.println();
		
		int arr1[] = {2,6,8,5,4,3} ;
		int arr2[] = {2,3,4,7,8} ;
		System.out.println("here the intersection elements of arr1 and arr2");
		printIntersection(arr1, arr2);
		System.out.println();
		
		String str = "coding ninja is good" ;
		System.out.println("After extract unique character the string will be  :: " + ExtractUniquecharacter(str));
		System.out.println();
		
//		int arr[] = {5,1,2,4,3} ;
// 		System.out.println("pair with k differences  : ") ;
// 		pairWithKdifferences(arr, 2); 

	}

}
