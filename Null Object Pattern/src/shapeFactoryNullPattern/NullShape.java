package shapeFactoryNullPattern;

public class NullShape implements Shape {

	private static final NullShape instance = new NullShape();

	private NullShape() {
	}

	@Override
	public void draw() {
		System.out.println("This does nothing, because its not a Shape.");
	}

	public static NullShape getinstance() {
		return instance;
	}

}
