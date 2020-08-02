
public class array_practice {
	public static void main(String [] args) {
		//int apples[] = {10,20,30,40,50};
		//System.out.println(apples[0]);
		//System.out.println(apples[1]);
		System.out.println("The total sum of Indefinate Nos is :");
		System.out.println(totalValue(10,20,30,40,50,60,70,80,90,100));
	}
	//public static int myTotal(int a, int b, int c) {
		//int sum = a+b+c;
		//return(sum);
		
	public static int totalValue(int...apples) {
		int sum = 0;
		for(int x:apples) {
			sum += x;
		}
		return sum;
	}
}


