package Lecture_17_HashMap;

public class MapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> ans = new Map<>() ;
		for ( int i = 0 ; i < 20 ; i++) {
			ans.insert("abc" + i, 1 + i);
			System.out.println("i = " + i + " Lf = "+ ans.loadFactor());
		}
		ans.removeKey("abc5") ;
		ans.removeKey("abc11") ;
		ans.insert("abc11", 500);
		for (int i = 0; i < 20; i++) {
			System.out.println("abc" + i + " : " + ans.getValue("abc" + i));
		}
	}

}
