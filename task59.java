package d13_Methods;

public class task59 {

	public static void main(String[] args) {


		int nHour=8;
		double nPay=20.5;
		totalPay(nHour,nPay);
		
		totalPay(10, 20.5);
		
		
	}

	private static void totalPay(int hour, double pay) {
		System.out.println("ur pay according the hours is "+hour*pay);
	}

}
