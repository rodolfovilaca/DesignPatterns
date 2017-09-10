package shapeFactory.colors;

import shapeFactory.AbstractFactory;
import shapeFactory.shapes.Shape;
import shapeFactory.shapes.ShapeFactory.shapeType;

public class ColorFactory extends AbstractFactory{
	public static enum colorType{
		RED,
		BLUE,
		GREEN
	}
	
	@Override
	public Color getColor(colorType color) {
		if(color.equals(colorType.RED)){
			return new Red();
		}
		else if(color.equals(colorType.BLUE)){
			return new Blue();
		}
		else if(color.equals(colorType.GREEN)){
			return new Green();
		}
		return null;
	}

	@Override
	public Shape getShape(shapeType shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
