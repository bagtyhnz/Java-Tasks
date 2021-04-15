package d18_ReadUserInput;

import java.util.Scanner;

public class task77 {

	public static void main(String[] args) {


		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		do {
			
		
		System.out.println("enter ur emoji");
		String emoji=scanner.next();
		
		if (emoji.length()<3) {
			
			if (emoji.charAt(0)==':') 
			{
				if (emoji.charAt(1)==')'||emoji.charAt(1)=='('||emoji.charAt(1)=='/'||emoji.charAt(1)=='p')
				{ System.out.println("valid emoji"); }
			}
			 
			else if (emoji.charAt(0)==';') 
			{
				if (emoji.charAt(1)==')'||emoji.charAt(1)=='0') {
					System.out.println("valid emoji");
				}}
			
			else {
				System.out.println("invalid emoji");

			}}} while (true);
	}

}
