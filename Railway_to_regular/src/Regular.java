import java.util.Scanner;

@SuppressWarnings("unused")
public class Regular {
	public static void main(String [] args) {
		regular1 regular1obj = new regular1();
		regular1obj.setTime(10,11,12);
		System.out.println("The Railway time is :");
		System.out.println(regular1obj.fullTime());
		System.out.println("");
		System.out.println("The Regular time is :");
		System.out.println(regular1obj.regularTime());
	}

}

