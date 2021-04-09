package d13_Methods;

public class task65 {

	public static void main(String[] args) {


		gradeCalc(100, 80, 96);
		gradeCalc(50, 80, 60);
		gradeCalc(50, 50, 50);

	}

	private static void gradeCalc(int i, int j, int k) {

		int av=(i+j+k)/3;
		
		if (av>=90&&av<=100) {
			System.out.println("ur grade is A");
		} 
		
		else if (av>=80&&av<=89) {
			System.out.println("ur grade is B");
		}
		else if (av>=70&&av<=79) {
			System.out.println("ur grade is C");
		}
		else if (av>=60&&av<=69) {
			System.out.println("ur grade is D");
		}
		else if (av>=0&&av<=59) {
			System.out.println("ur grade is F");
		}
		
	}

}
