package d18_ReadUserInput;

import java.util.Scanner;

public class task78 {

	public static void main(String[] args) {


		String str = "abcabqcabc";
		char myChar = 'q';
		
		int counter=0; 
		
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==myChar) {
				
				counter++;
			}
		}
		
		System.out.println("Count for " + myChar + " is " + counter);
		
		
	}

}
