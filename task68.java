package d14_ReturnMethods;

public class task68 {

	public static void main(String[] args) {

		

		retirementCalc("Bagty", 1991);
	}

	public static int ageCalc(int bYear) {
     return 2021-bYear;
		
		
	}
	public static void retirementCalc(String string, int bYear) {
		
		int retirement=70-ageCalc(bYear);
System.out.println(string+" will retire in "+retirement+" years");

		
		
	}

	

}
