package ComplexNumClass;

import java.util.Scanner;

public class ComplexNumUse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in) ;

//		int real1 = s.nextInt();
//		int imaginary1 = s.nextInt();
//
//		int real2 = s.nextInt();
//		int imaginary2 = s.nextInt();
		
		int real1 = 4 ;
		int imaginary1 = 5 ;
		
		int real2 = 6 ;
		int imaginary2 = 7 ;

		ComplexNum c1 = new ComplexNum(real1, imaginary1);
		ComplexNum c2 = new ComplexNum(real2, imaginary2);

		int choice = s.nextInt();

		 System.out.println("if add press 1 for multiply press 2");
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}

}
