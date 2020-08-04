import java.util.Scanner;
@SuppressWarnings("unused")
public class variables_practice {
	private int hour=10;
	private int minute=11;
	private int second=12;
	
	public void setTime(int hour, int minute, int second) {
		this.hour = 13;
		this.minute = 14;
		this.second = 15;
		
	}
	
	public String time() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

}

