package prototypeShape;

import prototypeShape.ShapeFactory.ShapeType;

public class Main {
	public static void main(String[] args){
		ShapeFactory factory = new ShapeFactory();
		
		Shape circle = factory.createShape(ShapeType.CIRCLE);
		circle.draw();
		
		Shape rectangle = factory.createShape(ShapeType.RECTANGLE);
		rectangle.draw();
		
		Shape square = factory.createShape(ShapeType.SQUARE);
		square.draw();
	}
}
