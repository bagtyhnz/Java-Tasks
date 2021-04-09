package d13_Methods;

public class task60 {

	public static void main(String[] args) {


		calculator(6,3,'*');
		calculator(6, 3,'-');
		calculator(6,3,'+');
		calculator(6,3,'/');
		
	}

	private static void calculator(double n1, double n2, char operator) {

		switch (operator) {
		
		case '*': System.out.println(n1+" * "+n2+" = "+(n1*n2));
			break;
		case '/': System.out.println(n1+" / "+n2+" = "+(n1/n2));
		break;
		
		case '+': System.out.println(n1+" + "+n2+" = "+(n1+n2));
		break;
		
		case '-': System.out.println(n1+" - "+n2+" = "+(n1-n2));
		break;
		}
		
	}

}
