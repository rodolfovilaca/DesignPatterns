package prototypeShape;

import prototypeShape.ShapeFactory.ShapeType;

public class Rectangle implements Shape{
	private ShapeType type = ShapeType.RECTANGLE;

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle...");	
	}

	@Override
	public Shape clone() {
		return new Rectangle();
	}

	@Override
	public ShapeType getType() {
		return type;
	}
}
