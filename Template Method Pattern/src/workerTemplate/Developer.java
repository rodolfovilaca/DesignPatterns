package workerTemplate;

public class Developer extends Worker {

	@Override
	public void getUp() {
		System.out.println("Developer get up at 7:00AM");

	}

	@Override
	public void sleep() {
		System.out.println("Developer go to sleep at 3:00AM");

	}

	@Override
	public void goHome() {
		System.out.println("Developer go home at 5:00PM");

	}

	@Override
	public void goToWork() {
		System.out.println("Developer go to work at 8:00AM");

	}

	@Override
	public void eat() {
		System.out.println("Developer eats at any time");
	}

}
