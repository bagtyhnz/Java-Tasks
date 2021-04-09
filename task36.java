package d9_SwitchStatements;

public class task36 {

	public static void main(String[] args) {


		double n1, n2, result;
		n1=1;
		n2=10;
	
		
		String operation="divide";
		
		switch (operation) {
		
		case "add":
			result=n1+n2;
			System.out.println(result);
			break;

		case "subtract":
			result=n1-n2;
			System.out.println(result);
			break;
			
		case "multiply":
			result=n1*n2;
			System.out.println(result);
			break;
			
		case "divide":
			result=n1/n2;
			System.out.println(result);
			break;
			
			
		default:
			System.out.println("invalid operation");
			break;
		}
	}

}
