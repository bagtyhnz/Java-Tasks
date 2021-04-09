package d14_ReturnMethods;

public class task69 {

	public static void main(String[] args) {


		int n=9;
		System.out.println(isPrime(n));
		
	}

	public static boolean isPrime(int n) {
		
		boolean b=true;
		if (n!=0 && n!=1) {
			for (int i = 2; i < n; i++) {
				if (n%i==0) {
					b=false;
					break;
				}
				else {
					b=true;
					
				}
			}
			
		}
		
		return b;

		
	}

}
