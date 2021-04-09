package d7_ControlFlowStatements;

public class task27 {

	public static void main(String[] args) {


		int hour;
		hour=11;
		
		if (hour<12) {
			System.out.println("Good morning!");
		}
		
		if (hour>=12&&hour<15) {
			System.out.println("Good afternoon!");
		}
		
		if (hour>=15) {
			System.out.println("Good evening!");
		}
	}

}
