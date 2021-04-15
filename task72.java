package d18_ReadUserInput;

import java.util.Scanner;

public class task72 {
	public static void main(String[] args) {
		
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter 3 number consequently:");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	
	int sum=n1+n2+n3;
	System.out.println("sum is "+sum);
	
}
}