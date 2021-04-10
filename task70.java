package d14_ReturnMethods;

public class task70 {

	public static void main(String[] args) {


		
		displayPosition("Jordan", calcPosition(1500));
		displayPosition("Mike", calcPosition(900));
		displayPosition("Percy", calcPosition(400));
		displayPosition("Jackson", calcPosition(50));
		
	}

	public static int calcPosition(int score) {
		
		if (score>=1000) {
			 return 1;
		} 
		else if (score>=500 && score<1000) {
			 return 2;
		}
		else if (score>=100 && score<500) {
			return 3;
		}
		else {
			return 4;
		}
			
	}

	private static void displayPosition(String string, int rank) {
		
		System.out.println(string+" managed to get into position  "+rank+" on the high score table");
	}

}
