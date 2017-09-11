package prototypeShape;

import prototypeShape.ShapeFactory.ShapeType;

public class Circle implements Shape{
	private ShapeType type = ShapeType.CIRCLE;
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle...");	
	}

	@Override
	public Shape clone() {
		return new Circle();
	}
	
	@Override
	public ShapeType getType() {
		return type;
	}
}
