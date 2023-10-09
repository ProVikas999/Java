package Recursion_1_Lecture_03;

public class Number_Of_Digit {
	public static int count(int n) {
		if (n == 0) {
			return 0 ;
		}
		return count(n/10) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =count(79852) ;
		System.out.println(a);

	}

}
