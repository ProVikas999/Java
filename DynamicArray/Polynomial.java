package DynamicArray;

public class Polynomial {
	int Arr[] = new int[100] ;
	
	public void setArr (int degree , int coeff) {
		if (degree > Arr.length - 1) {
			int temp[] = Arr ;
			Arr = new int [degree + 1] ;
			for ( int i = 0 ; i < temp.length ; i++) {
				Arr[i] = temp[i] ;
			}
		}
		Arr[degree] = coeff ;
	}
	public void Print() {
		for ( int i = 0 ; i< Arr.length ; i++) {
			if (Arr[i] != 0) {
				System.out.print(Arr[i] + "X^" + i + " ");
			}
		}
	}
	public Polynomial add(Polynomial P) {
		for (int i = 0 ; i < this.Arr.length ; i++) {
			for (int j = 0 ; j < P.Arr.length ; j++) {
				if ( i == j && (this.Arr[i] != 0 || P.Arr[j] != 0)) {
					this.Arr[i] = this.Arr[i] + P.Arr[i] ;
				}
			}
		}
		return this ;
	}
	public Polynomial subtract(Polynomial P) {
		for (int i = 0 ; i < this.Arr.length/2 ; i++) {
			for (int j = 0 ; j < P.Arr.length/2 ; j++) {
				if ( i == j && (this.Arr[i] != 0 || P.Arr[j] != 0)) {
					this.Arr[i] = this.Arr[i] - P.Arr[i] ;
				}
			}
		}
		return this ;	
	}
	public Polynomial multiply(Polynomial P) {
		Polynomial a = new Polynomial() ;
		for ( int i = 0 ; i < this.Arr.length/2 ; i++) {
			for (int j = 0 ; j < P.Arr.length/2 ; j++) {
				a.Arr[(i+j)] = a.Arr[(i+j)] + this.Arr[i] * P.Arr[j] ;
			}
		}
		return a ;
	}
	public static Polynomial add(Polynomial p1 , Polynomial p2) {
		Polynomial A  = new Polynomial() ;
		for (int i = 0 ; i < p1.Arr.length/2 ; i++) {
			for (int j = 0 ; j < p2.Arr.length/2 ; j++) {
				if ( i == j && (p1.Arr[i] != 0 || p2.Arr[j] != 0)) {
					 A.Arr[i] = p1.Arr[i] + p2.Arr[j] ;
				}
			}
			
	}return A ;
		
	}
	public int evaluate(int x) {
		Polynomial a = new Polynomial() ;
		
		
		return x ;
	}
}
