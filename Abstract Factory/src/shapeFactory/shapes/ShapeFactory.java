package shapeFactory.shapes;

import shapeFactory.AbstractFactory;
import shapeFactory.colors.Color;
import shapeFactory.colors.ColorFactory.colorType;

public class ShapeFactory extends AbstractFactory{
	public static enum shapeType{
		RECTANGLE,
		CIRCLE,
		SQUARE
	}
	
	@Override
	public Color getColor(colorType color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(shapeType shape) {
		if(shape.equals(shapeType.CIRCLE)){
			return new Circle();
		}
		else if(shape.equals(shapeType.RECTANGLE)){
			return new Rectangle();
		}
		else if(shape.equals(shapeType.SQUARE)){
			return new Square();
		}
		return null;
	}

}
