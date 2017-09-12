package paymentStrategy;
public class PaymentContext {
	private final Payment payment;

	public PaymentContext(Payment payment) {
		this.payment = payment;
	}
	
	public void executeStrategy(){
		payment.pay();
	}
}
