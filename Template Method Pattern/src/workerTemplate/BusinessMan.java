package workerTemplate;

public class BusinessMan extends Worker {

	@Override
	public void getUp() {
		System.out.println("BusinessMan get up at 4:00AM");

	}

	@Override
	public void sleep() {
		System.out.println("BusinessMan go to sleep at 10:00PM");

	}

	@Override
	public void goHome() {
		System.out.println("BusinessMan go home at 8:00PM");

	}

	@Override
	public void goToWork() {
		System.out.println("BusinessMan go to work at 6:00AM");

	}

	@Override
	public void eat() {
		System.out.println("BusinessMan never eats");

	}

}
