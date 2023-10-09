package DynamicArray;

public class PolynomialUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polynomial p1 = new Polynomial() ;
		p1.setArr(0, 5);
		p1.setArr(2, 2);
		p1.Print();
		System.out.println();
		
		Polynomial p2 = new Polynomial() ;
		p2.setArr(0,3);
		p2.setArr(2,2);
		p2.setArr(1,4);
		p2.setArr(2,5);
		p2.setArr(19, 100);
		
		p2.Print();
		System.out.println();
		
		p1.add(p2) ;
		p1.Print(); 
		System.out.println();
		p2.Print();
		System.out.println();
		
		p1.subtract(p2) ;
		p1.Print(); 
		System.out.println();
		p2.Print();
		System.out.println();


		p2.multiply(p1) ;
		p2.Print();
		System.out.println();
		p1.Print();
		System.out.println();
		Polynomial p3 = Polynomial.add(p1,p2) ;
		System.out.println();
		p3.Print();
		System.out.println();
		p1.Print(); 
		System.out.println();
		p2.Print();
		
		p1.evaluate(10) ;
		
	}

}
