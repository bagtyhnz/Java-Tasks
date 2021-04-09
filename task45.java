package d10_TernaryOperators;

public class task45 {

	public static void main(String[] args) {


		int n1=54;
		int n2=34;
		int repeat=3;
		
		for (int i = 0; i <repeat; i++) {
			if (n1>n2) {
				System.out.println(n1+" is bigger than "+n2);
			}
			else if (n1==n2) {
				System.out.println(n1+" is equal to "+n2);
			}
			else {
				System.out.println(n2+" is bigger than "+n1);
			}
		}
		
	}

}
