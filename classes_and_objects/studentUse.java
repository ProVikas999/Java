package classes_and_objects;
import java.util.* ;
public class studentUse {
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		
		student s1 = new student();
		student s2 = new student() ;
		s1.name = "ankush" ;
		s1.setRollnumber(-123) ;
		
		System.out.println(s1) ;
//		System.out.println(s2) ;
		System.out.println(s1.name) ;
		System.out.println(s1.getRollnumber()) ;

	}

}
