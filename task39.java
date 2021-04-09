package d9_SwitchStatements;

public class task39 {

	public static void main(String[] args) {


		char color ='g';
		
		switch (color) {
		
		case 'r': case 'R': //if string matches 'R' OR 'r', any of 2 cases
		System.out.println("red");
			break;
		
		
		case 'o': case 'O':
			System.out.println("orange");
				break;
				
		
		case 'g': case 'G':
			System.out.println("green");
				break;
				
		
		}
	}

}
