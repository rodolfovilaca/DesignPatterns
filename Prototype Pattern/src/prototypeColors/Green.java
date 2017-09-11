package prototypeColors;

import prototypeColors.ColorFactory.ColorType;

public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Filling with color Green...");

	}

	@Override
	public Color clone() {
		return new Green();
	}

	@Override
	public ColorType getType() {
		return ColorType.GREEN;
	}

}
