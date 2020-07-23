import java.util.Scanner;
public class mathOperations {
	public static void main(String []args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter any number :");
		double number; double number1; double number2; double number3; double number4; double number5;
		double root_value; 
		number = input.nextDouble();
		System.out.println("You entered :"+number);
		number = Math.ceil(number);
		System.out.println("The ceil value is :"+number);
		number = Math.sqrt(number);
		System.out.println("The Square_root value is :"+number);
		System.out.println("Enter the root value for number :");
		root_value = input.nextDouble();
		number = Math.pow(number, root_value);
		System.out.println("The power of the number is :"+number);
		System.out.println("Enter any 2 numbers :");
		number2 = input.nextDouble();
		number3 = input.nextDouble();
		number4 = Math.max(number2, number3);
		number5 = Math.min(number2, number3);
		System.out.println("The max value of 2 nos is :"+number4);
		System.out.println("The min value of 2 nos is :"+number5);
		System.out.println("Please Enter number for floor value :");
		number1 = input.nextDouble();
		number1 = Math.floor(number1);
		System.out.println("The floor value is :"+number1);		
 }
}

// First commit done......