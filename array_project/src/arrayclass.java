
public class arrayclass {
	public static void main(String []args) {
		//System.out.println("Below function is defined as array initializer using While loop :");
		//System.out.println();
		//System.out.println("Index\tvalue");
		/*
		int apple[] = new int[5];
		apple[0] = 10;
		apple[1] = 20;
		apple[2] = 30;
		apple[3] = 40;
		apple[4] = 50;
		System.out.println("Index value 1 is :" + apple[1]);
		*/
		//int x =0;
		int total=0;
		System.out.println("Using Enhanced for loop for adding nos defined in array :");
		int apple[] = {10,20,30,40,50,60,70,80,90,100};
		
		for(int x : apple) {
			//System.out.println(x +"\t" +apple[x]);
			total += x;
		}
		System.out.println("The total value of Array is :"+ total);
		/*
		System.out.println(apple[0]);
		System.out.println(apple[1]);
		System.out.println(apple[2]);
		System.out.println(apple[3]);
		System.out.println(apple[4]);
		System.out.println(apple[5]);
		System.out.println(apple[6]);
		System.out.println(apple[7]);
		System.out.println(apple[8]);
		System.out.println(apple[9]);
		*/
	}
}


