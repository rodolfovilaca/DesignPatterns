package paymentStrategy;

public class AmazonPayment implements Payment{

	@Override
	public void pay() {
		System.out.println("Paying with AmazonPay");
		
	}

}
