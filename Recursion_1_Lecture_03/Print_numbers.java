package Recursion_1_Lecture_03;

public class Print_numbers {
	public static void Print (int n) {
		if (n == 1) {
			System.out.print(n+ " ");
			return ;
		}
		Print(n-1) ;
		System.out.print(n + " "); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Print(100) ;

	}

}
