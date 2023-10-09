package Recursion_1_Lecture_03;

public class checkNumberInArray {
	public static boolean Checknumber(int input[] , int x) {
		return check(input , x , 0) ;
	}
	public static boolean check(int input[] , int x , int startindex) {
		if ( startindex == input.length) {
			return false ;
		}
		if ( input[startindex] == x) {
			return true ;
		}
		return check(input, x, startindex + 1) ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {2,1,3,4,7,9} ;
		int x = 4 ;
		System.out.println(Checknumber( input ,  x));
		

	}

}
