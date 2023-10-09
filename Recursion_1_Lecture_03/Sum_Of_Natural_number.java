package Recursion_1_Lecture_03;

public class Sum_Of_Natural_number {
	public static int sum(int n) {
		if (n ==1) {
			return 1 ;
		}
		return sum(n-1) + n ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sum(5));
	}

}
