package carTemplate;

public class ChevyChevette extends Car {

	@Override
	public void stop() {
		System.out.println("Chevette didn't stop...");
	}

	@Override
	public void turnRight() {
		System.out.println("Chevette is turning right in some minutes...");
	}

	@Override
	public void moveForward() {
		System.out.println("Chevette is going forward slowly...");
	}

	@Override
	public void start() {
		System.out.println("Chevette has barely started");
	}

}
