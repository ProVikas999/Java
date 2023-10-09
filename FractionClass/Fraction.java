package FractionClass;

public class Fraction {
	private int numerator ;
	private int denominator ;
	
	public Fraction (int numerator , int denominator) {
		this.numerator = numerator ;
		if (denominator == 0 ) {
			// TODO error out 
		}
		this.denominator = denominator ;
		Simplify() ;
	}
	public int getDenominator() {
		return denominator ;
	}
	public int getNumerator() {
		return numerator ;
	}
	public void SetNumerator(int n) {
		this.numerator = n ;
		Simplify() ;
	}
	public void SetDenominator(int d) {
		if (d == 0) {
			return ;
		}
		this.denominator = d ;
		Simplify() ;
	}
	public void Print() {
		if (denominator == 1) {
			System.out.println(numerator);
		}
		else {
			System.out.println(numerator + "/" + denominator);
		}
	} 
	public void Simplify() {
		int gcd = 1 ;
		int smaller = Math.min(numerator, denominator) ;
		for (int i = 2 ; i <=smaller ; i++) {
			if (numerator % i == 0  && denominator % i == 0) {
				gcd = i ;
			}
		}
		numerator = numerator/gcd ;
		denominator = denominator/gcd ;
	}
	public static Fraction add(Fraction f1 , Fraction f2) {
		int NewNum = f1.numerator*f2.denominator + f1.denominator*f2.numerator ;
		int Newden = f1.denominator*f2.denominator ;
		Fraction f = new Fraction(NewNum, Newden) ;
		return f ;
	}
	public void add(Fraction f2) {
		this.numerator = this.numerator*f2.denominator + this.denominator*f2.numerator ;
		this.denominator = this.denominator*f2.denominator ;
		Simplify() ;
	}
	public void multiply(Fraction f2) {
		this.numerator = this.numerator*f2.numerator ;
		this.denominator = this.denominator*f2.denominator ;
	}
	
}
