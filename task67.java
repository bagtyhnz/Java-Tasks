package d14_ReturnMethods;

public class task67 {

	public static void main(String[] args) {


		
		System.out.println(lastDigit(7,17));
		System.out.println(lastDigit(6,17));
		System.out.println(lastDigit(3,113));
		
		
	}

	private static boolean lastDigit(int i, int j) {


		boolean b;
		if (i==j%10) {
			b=true;
			
		} else {
			b=false;

		}
		return b;
	}

}
