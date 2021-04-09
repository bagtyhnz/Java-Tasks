package d8_ElseIfNestedStatements;

public class task33 {

	public static void main(String[] args) {


		int mark=100;
		
		if (mark<60) {
			System.out.println("u fail");
		} else if(mark>=60&&mark<=90){
			System.out.println("u pass");
		}
		else if(mark>90&&mark<=100){
			System.out.println("perfect");
		}
		else {
			System.out.println("invald mark");
		}
	}

}
