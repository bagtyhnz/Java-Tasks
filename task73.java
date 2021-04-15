package d18_ReadUserInput;

import java.util.Scanner;

public class task73 {

	public static void main(String[] args) {


		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int secret=18;
		int num;
		System.out.println("Guess the number btw 1-20");
		

		do {
			 num=scan.nextInt();
			
			 if (num>secret) {
				System.out.println("ur number is too big");}
			else if (num<secret) {
				System.out.println("ur number is too small");
			} else {
				System.out.println("congras, u guessed it");
			}
		} while (num!=secret);
		}
	}


