import java.util.Scanner;
public class subclass {
	public void compoundIntrest() {
		Scanner input = new Scanner(System.in);
		double amount;
		double principle;
		double rate;
		int months;
		System.out.println("########### Compound Intrest Calculations #############");
		System.out.println();
		System.out.println("Please enter principle amount :");
		principle = input.nextDouble();
		System.out.println("Please enter rate of Intrest :");
		rate = input.nextDouble()/100;
		System.out.println("Please enter duration in months :");
		months = input.nextInt();
		
		for(months =1;months<=12;months++) {
		amount = principle*Math.pow(1+rate, months);
		System.out.println(months+" " + amount);
		
		if(months==12) {
			System.out.println("Your total Intrest for "+months+ " months is :"+amount);
			
		}
		
		
	}
		
	}
	
}




