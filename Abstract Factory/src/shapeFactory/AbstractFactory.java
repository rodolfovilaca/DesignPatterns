package shapeFactory;

import shapeFactory.colors.Color;
import shapeFactory.colors.ColorFactory.colorType;
import shapeFactory.shapes.Shape;
import shapeFactory.shapes.ShapeFactory.shapeType;

public abstract class AbstractFactory {
	public abstract Color getColor(colorType color);
	public abstract Shape getShape(shapeType shape);
}