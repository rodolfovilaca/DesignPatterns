package paymentStrategy;

public class Main {
	public static void main(String[] args) {
		PaymentContext context = new PaymentContext(new AmazonPayment());
		context.executeStrategy();
		
		context = new PaymentContext(new PaypalPayment());
		context.executeStrategy();
		
		context = new PaymentContext(new CreditCardPayment());
		context.executeStrategy();
	}
}
