package ComplexNumClass;

public class ComplexNum {
	private int real ;
	private int imaginary ;
	
	public ComplexNum(int real , int imaginary) {
		this.real = real ;
		this.imaginary = imaginary ;	
	}
	public int getimaginary () {
		
		return imaginary ;
	}
	public int getreal () {
		return real ;
	}
	public void setreal(int n) {
		this.real = n ;
	}
	public void setimaginary1(int m) {
		if (m == 0) {
			this.imaginary = 0;
		}
		this.imaginary = m ;
	}
	public void print() {
		if ( this.imaginary < 0){
			System.out.println(this.real + " - i"  + -1* this.imaginary);	
	}
	else{
	System.out.println(this.real + " + "+ "i"  + this.imaginary);	
}
		
	}
	public void plus (ComplexNum c2) {
		this.real = this.real +c2.real ;
		this.imaginary = this.imaginary + c2.imaginary ;
	}
	public void multiply(ComplexNum c2) {
		
		int R= this.real*c2.real - this.imaginary * c2.imaginary;
		this.imaginary = this.real*c2.imaginary + this.imaginary*c2.real ;
		this.real = R ;
	}
//	a + ib  c + id = a*c + a* id + ib * c + ib * id
	
		
	
	
	
	
	

}
