
public class dummy_class {
	private int day;
	private int month;
	private int year;
	
	public dummy_class(int d, int m, int y) {
		day=d;
		month=m;
		year=y;
		//System.out.println("Your's Date of Birth is :");
		//System.out.println(this);
	}
	public String toString() {
		return String.format("%d/%d/%d", day,month,year);
	}

}

