package prototypeShape;

import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {
	private static List<Shape> shapePrototypes = new ArrayList<>();
	public static enum ShapeType{
		CIRCLE,RECTANGLE,SQUARE
	}
	
	static{
		shapePrototypes.add(new Rectangle());
		shapePrototypes.add(new Circle());
		shapePrototypes.add(new Square());
	}
	
	public Shape createShape(ShapeType type){
		for(Shape shape : shapePrototypes){
			if(shape.getType().equals(type)){
				return shape.clone();
			}
		}
		System.out.println("Shape Doesn't exist");
		return null;
	}
}
