package d18_ReadUserInput;

import java.util.Scanner;

public class task74 {

	public static void main(String[] args) {


		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter ur number ");
		int n=scanner.nextInt();
		int nn;
		
		do {System.out.println("enter ur next number");
			nn=scanner.nextInt();
			if (nn>0) {
				n=n+nn;
			} else {
				break;
			}
			
			
		} while (true);
		System.out.println("sum of numbers is "+n);
	} 

}
