package practice;
import java.util.*;
public class Character_pattern {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i<=n) {
			int j = 1;
			while(j<=n) {
				System.out.print((char)('A'+j-1)  );
				j++;
			}
			System.out.println();
			i++;
		}
		

	}

}
//ABCD
//ABCD
//ABCD
//ABCD