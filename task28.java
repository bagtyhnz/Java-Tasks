package d7_ControlFlowStatements;

public class task28 {

	public static void main(String[] args) {


		int price, quantity, revenue, discount;
		price=10;
		quantity=55;
		discount=0;
		revenue=price*quantity;
		
		
		if (revenue>5000) {
			discount=revenue/10;
			revenue=revenue-discount;
		}			System.out.println("revenue is "+revenue+"\tdiscount is "+discount);

	}

}
