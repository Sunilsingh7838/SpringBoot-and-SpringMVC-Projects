package Project_Practice1;

public class BillPayment {

	private Ipayment payment;
	

	public void setPayment(Ipayment payment) {
		this.payment = payment;
	}
	
	public BillPayment(Ipayment payment) {
		this.payment = payment;
	}
	
	public BillPayment() {
		
	}



	public void collectPayment(double amount) {
		String status = payment.pay(amount);
		System.out.println(status);
	}
}
