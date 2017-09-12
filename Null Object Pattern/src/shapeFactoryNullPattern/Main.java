package shapeFactoryNullPattern;

public class Main {
	public static void main(String[] args){
		ShapeFactory factory = new ShapeFactory();
		
		Shape rectangle = factory.getShape("RECTANGLE");
		rectangle.draw();
		
		Shape circle = factory.getShape("CIRCLE");
		circle.draw();
		
		Shape nothing = factory.getShape("");
		nothing.draw();
	}
}
