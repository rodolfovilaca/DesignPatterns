package prototypeShape;

import prototypeShape.ShapeFactory.ShapeType;

public interface Shape {
	public Shape clone();
	public void draw();
	public ShapeType getType();
}
