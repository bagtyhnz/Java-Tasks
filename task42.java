package d10_TernaryOperators;

public class task42 {

	public static void main(String[] args) {

		int sumEven=0;
		int sumOdd=0;
		
		for (int i = 1; i <100; i++) {
			
			if (i%2!=0) {
				sumEven=sumEven+i;
				
			} 
			
			else {
				sumOdd=sumOdd+i;
			}
			
		} 
		System.out.println(sumEven);
		System.out.println(sumOdd);
		System.out.println(sumEven+sumOdd);
		
	}

}
