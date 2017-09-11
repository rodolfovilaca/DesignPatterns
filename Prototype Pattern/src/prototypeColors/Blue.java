package prototypeColors;

import prototypeColors.ColorFactory.ColorType;

public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Filling with color Blue...");

	}

	@Override
	public Color clone() {
		return new Blue();
	}

	@Override
	public ColorType getType() {
		return ColorType.BLUE;
	}

}
