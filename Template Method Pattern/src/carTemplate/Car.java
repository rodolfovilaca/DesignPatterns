package carTemplate;

public abstract class Car {
	public void drive(){
		start();
		moveForward();
		turnRight();
		stop();
		
	}

	public abstract void stop();
	public abstract void turnRight();
	public abstract void moveForward();
	public abstract void start();
}
