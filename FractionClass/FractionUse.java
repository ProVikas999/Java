package FractionClass;

public class FractionUse {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(20, 30) ;
		f1.Print(); //2/3
		f1.SetNumerator(12);//4
		int d = f1.getDenominator() ;
		System.out.println(d); //1
		f1.Print(); //4
		f1.SetNumerator(10);
		f1.SetDenominator(30);
		f1.Print();//1/3
		
		Fraction f2 = new Fraction(3,4) ;
		f1.add(f2);
		f1.Print();
		f2.Print();
		
		Fraction f3 = new Fraction(4, 5) ;
		f3.multiply(f2); 
		f3.Print();
		f2.Print(); 
		
		Fraction f4 = Fraction.add(f1, f3) ;
		f1.Print();
		f2.Print();
		f4.Print();
		

	}

}
