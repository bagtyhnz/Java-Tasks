package d14_ReturnMethods;

public class task66 {

	public static void main(String[] args) {


		distance(100,3);
		System.out.println(distance(100,3));
		
	}

	public static int distance(int speed, int time) {

		int distance=speed*time;
		return distance;

		
	}

}
