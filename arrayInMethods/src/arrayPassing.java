
public class arrayPassing {
	public static void main(String []args) {
		int apples[] = {10,20,30,40,50};
		
		for(int y : apples) {
			System.out.println(y);
		}
		System.out.println();
		secondMethod(apples);
		for(int z : apples) {
			System.out.println(z);
		}
	}
	
	public static void secondMethod(int dummy[]) {
		for(int c=0;c<dummy.length;c++) {
			dummy[c] += 5; 
			
		}
		
	}

}
