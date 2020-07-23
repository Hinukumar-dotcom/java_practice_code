import java.util.Scanner;
public class thirdclass {

	public void simpleIntrest() {
		Scanner input = new Scanner(System.in);
		
		// simple Intrest program.....starts......
		System.out.println("########### Simple Intrest Calculations #############");
		System.out.println();
		double amount;
		double principle;
		System.out.println("Please enter the Principle amount :");
		principle = input.nextDouble();
		double rate;
		System.out.println("Please enter the rate of intrest :");
		rate = input.nextDouble()/100;
		int months;
		System.out.println("Please enter the no of months :");
		months = input.nextInt();
		double term_intrest;
		term_intrest = principle*rate;
		double total_intrest = term_intrest*months;
		double total_intrest_including_principle = total_intrest+principle;
		
		System.out.println("Your total intrest Excluding Principle amount is :"+total_intrest);
		System.out.println();
		System.out.println("Your total intrest including Principle amount is :"+total_intrest_including_principle);
		
	}
			
}	








