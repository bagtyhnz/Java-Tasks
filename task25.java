package d7_ControlFlowStatements;

public class task25 {

	public static void main(String[] args) {


		int n1,n2,n3;
		n1=4;
		n2=8;
		n3=1;
		 if ((n1>n2)&&(n1>n3)) {
			System.out.println("the greatest number is "+n1);
		}
		 if ((n2>n1)&&(n2>n3)) {
				System.out.println("the greatest number is "+n2);
			}
		 
		 if ((n3>n2)&&(n3>n1)) {
				System.out.println("the greatest number is "+n3);
			}
	}

}
