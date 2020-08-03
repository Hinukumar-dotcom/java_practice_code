
public class regular1 {
	private int hour;
	private int minute;
	private int second;
	private int third;
	
	public void setTime(int hh, int mm, int ss) {
		hour = ((hh>=0 && hh<24 ? hh : 0));
		minute = ((mm>=0 && mm<60 ? mm : 0));
		second = ((ss>=0 && ss<60 ? ss : 0));
}

	 public String fullTime() {
		 return String.format("%02d:%02d:%02d", hour,minute,second);
	 }
	 public String regularTime() {
		 return String.format("%d:%02d:%02d %s",(hour==0 || hour == 12 ? 12 : hour%12),minute,second, (hour<12 ? "AM" : "PM"));
	 }
}

// convesion of Railway Time to Regular Time......
// Code working succesfully....
// tested....