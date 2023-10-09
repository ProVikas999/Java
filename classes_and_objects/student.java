package classes_and_objects;

public class student {
	public String name ;
	private int rollnumber ;
	public void setRollnumber(int rn) {
		rollnumber = rn ;
		if (rn<=0) {
			return ;
		}
	}
	public int getRollnumber() {
		return rollnumber ;
	}
	



}
