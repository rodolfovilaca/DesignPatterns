package prototypeColors;

import prototypeColors.ColorFactory.ColorType;

public class Main {
	public static void main(String[] args) {
		ColorFactory factory = new ColorFactory();
		
		Color red = factory.createColor(ColorType.RED);
		red.fill();
		
		Color blue = factory.createColor(ColorType.BLUE);
		blue.fill();
		
		Color green = factory.createColor(ColorType.GREEN);
		green.fill();
	}
}
