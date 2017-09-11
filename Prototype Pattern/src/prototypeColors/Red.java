package prototypeColors;

import prototypeColors.ColorFactory.ColorType;

public class Red implements Color {
	@Override
	public void fill() {
		System.out.println("Filling with color Red...");
	}

	@Override
	public Color clone() {
		return new Red();
	}

	@Override
	public ColorType getType() {
		return ColorType.RED;
	}
}
