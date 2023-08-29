package Project_Practice1;

public class test {
	
	public static void main(String[] args) {
		
//		BillPayment bp = new BillPayment();
		//Injecting Credit card obj into BillPayment (Setter injection).
//		bp.setPayment(new CreditCardPayment());
		
		//Injecting Credit card obj into BillPayment (Constructor injection).
		BillPayment bp1 = new BillPayment(new CreditCardPayment());
		bp1.collectPayment(1500.00);
	}
	

}
