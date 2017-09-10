package shapeFactory;
import shapeFactory.colors.Color;
import shapeFactory.colors.ColorFactory;
import shapeFactory.colors.ColorFactory.colorType;
import shapeFactory.shapes.Shape;
import shapeFactory.shapes.ShapeFactory;
import shapeFactory.shapes.ShapeFactory.shapeType;

public class Main {
	public static void main(String[] args){
		AbstractFactory shape = new ShapeFactory();
		
		Shape circle = shape.getShape(shapeType.CIRCLE);
		circle.draw();
		
		Shape rectangle = shape.getShape(shapeType.RECTANGLE);
		rectangle.draw();
		
		AbstractFactory color = new ColorFactory();
		
		Color red = color.getColor(colorType.RED);
		red.fill();
		
		Color blue = color.getColor(colorType.BLUE);
		blue.fill();
		
	}
}
