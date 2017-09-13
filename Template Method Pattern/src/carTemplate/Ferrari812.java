package carTemplate;

public class Ferrari812 extends Car {

	@Override
	public void stop() {
		System.out.println("The Ferrari is stopping smoothly");
	}

	@Override
	public void turnRight() {
		System.out.println("The Ferrari is turning right");
	}

	@Override
	public void moveForward() {
		System.out.println("The Ferrari is accelerating fast forward");
	}

	@Override
	public void start() {
		System.out.println("The Ferrari has started");
	}

}
