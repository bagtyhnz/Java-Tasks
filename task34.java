package d8_ElseIfNestedStatements;

public class task34 {

	public static void main(String[] args) {

		int english, german, french;
		english=98;
		german=45;
		french=75;
		int average=(english+german+french)/3;
		System.out.println("average score is "+average); 
		
		if (average>=0&&average<=59) {
			System.out.println("ur grade is E");
		} else if (average>=60&&average<=69) {
			System.out.println("ur grade is D");
		}
		else if (average>=70&&average<=79) {
			System.out.println("ur grade is C");
		}
		else if (average>=80&&average<=89) {
			System.out.println("ur grade is B");
		}
		else if (average>=90&&average<=100) {
			System.out.println("ur grade is A");
		}
		
		

		
	}

}
