import shapeFactory.Shape;
import shapeFactory.ShapeFactory;
import shapeFactory.ShapeFactory.shapeType;

public class Main {
	public static void main(String[] args){
		ShapeFactory factory = new ShapeFactory();
		
		Shape rectangle = factory.getShape(shapeType.RECTANGLE);
		rectangle.draw();
		
		Shape circle = factory.getShape(shapeType.CIRCLE);
		circle.draw();
	}
}
