package shapeFactoryNullPattern;

public class ShapeFactory {
	
	public Shape getShape(String type){
		if(type.equals("CIRCLE")){
			return new Circle();
		}else if(type.equals("RECTANGLE")){
			return new Rectangle();
		}else if(type.equals("SQUARE")){
			return new Square();
		}
		return NullShape.getinstance();
	}
}
