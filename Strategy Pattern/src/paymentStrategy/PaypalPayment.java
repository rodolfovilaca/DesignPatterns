package paymentStrategy;

public class PaypalPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("Paying with PayPal");

	}

}
