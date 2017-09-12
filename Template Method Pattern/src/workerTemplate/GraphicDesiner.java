package workerTemplate;

public class GraphicDesiner extends Worker {

	@Override
	public void getUp() {
		System.out.println("GraphicDesiner get up at 8:00AM");

	}

	@Override
	public void sleep() {
		System.out.println("GraphicDesiner go to sleep at 1:00AM");

	}

	@Override
	public void goHome() {
		System.out.println("GraphicDesiner go home at 6:00PM");

	}

	@Override
	public void goToWork() {
		System.out.println("GraphicDesiner go to work at 9:00AM");

	}

	@Override
	public void eat() {
		System.out.println("GraphicDesiner eats every 3 hours");

	}

}
