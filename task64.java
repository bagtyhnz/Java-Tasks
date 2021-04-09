package d13_Methods;

public class task64 {

	public static void main(String[] args) {


		printPattern(7);
		
	}

	private static void printPattern(int i) {


		for (int j = 0; j <= i; j++) {
			for (int j2 = 0; j2 <= j; j2++) {
				System.out.print("*");
			}System.out.println(" ");
		}
	}

}
