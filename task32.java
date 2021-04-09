package d8_ElseIfNestedStatements;

public class task32 {

	public static void main(String[] args) {


		int n1, n2, n3;
		n1=3;
		n2=5;
		n3=1;
		
		if (n1>n2&&n1>n3) {
			System.out.println("number 1 is largest ");
		}
		
		else if (n2>n1&&n2>n3) {
			
			System.out.println("number 2 is the largest");
		}
else if (n3>n1&&n3>n2) {
			
			System.out.println("number 3 is the largest");
		}
else  {
	
	System.out.println("numbers a equal");
}
	
	}
	

}
