package carTemplate;

public class WolkswagenGolf extends Car {

	@Override
	public void stop() {
		System.out.println("Golf is stopping...");
	}

	@Override
	public void turnRight() {
		System.out.println("Golf is turning right");
	}

	@Override
	public void moveForward() {
		System.out.println("Golf is going forward...");
	}

	@Override
	public void start() {
		System.out.println("Golf has started");
	}


}
