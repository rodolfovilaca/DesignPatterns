package prototypeShape;

import prototypeShape.ShapeFactory.ShapeType;

public class Square implements Shape{
	private ShapeType type = ShapeType.SQUARE;
	
	@Override
	public void draw() {
		System.out.println("Drawing Square...");	
	}

	@Override
	public Shape clone() {
		return new Square();
	}
	
	@Override
	public ShapeType getType() {
		return type;
	}
}
