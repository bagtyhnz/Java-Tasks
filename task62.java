package d13_Methods;

public class task62 {

	public static void main(String[] args) {


		calculateGreatest(18,24,29);
		
	}

	private static void calculateGreatest(int i, int j, int k) {

		
		if (i>j&&i>k) {
			System.out.println("the greatest number is "+i);
		}
		else if (j>i&&j>k) {
			System.out.println("the greatest number is "+j);
		}
		else {
			System.out.println("the greatest number is "+k);
		}
	}

}
