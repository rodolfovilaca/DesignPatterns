package shapeFactory;

public class ShapeFactory {
	public enum shapeType{
		CIRCLE,
		SQUARE,
		RECTANGLE
	}
	
	public Shape getShape(shapeType type){
		if(type.equals(shapeType.CIRCLE)){
			return new Circle();
		}else if(type.equals(shapeType.RECTANGLE)){
			return new Rectangle();
		}else if(type.equals(shapeType.SQUARE)){
			return new Square();
		}
		return null;
	}
}
