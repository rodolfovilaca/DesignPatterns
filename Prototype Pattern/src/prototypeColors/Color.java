package prototypeColors;

import prototypeColors.ColorFactory.ColorType;

public interface Color {
	public void fill();
	public Color clone();
	public ColorType getType();
}
