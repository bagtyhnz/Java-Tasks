package d18_ReadUserInput;

public class task79 {

	public static void main(String[] args) {


		String word ="CybertekSchool";
		char vowel = 0;
		
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u') 
			{
				vowel=word.charAt(i);
			System.out.print(vowel);
			if (i!=word.length()-2) {
				System.out.print(",");
				
			}}
			
			
			
		}
	}

}
