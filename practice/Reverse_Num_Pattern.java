package practice;
import java.util.*;

public class Reverse_Num_Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i<=n) {
			int j = 1;
			while (j<=n) {
				System.out.print(n-j+1);
				j++;
			}
			System.out.println();
			i++;
			
		}
	}

}


//4321
//4321
//4321
//4321

