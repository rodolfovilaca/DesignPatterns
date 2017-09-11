package prototypeColors;

import java.util.ArrayList;
import java.util.List;

public class ColorFactory {
	private static List<Color> colorsPrototypes = new ArrayList<>();

	public static enum ColorType {
		RED, BLUE, GREEN
	}

	static {
		colorsPrototypes.add(new Red());
		colorsPrototypes.add(new Blue());
		colorsPrototypes.add(new Green());
	}

	public Color createColor(ColorType type) {
		for (Color color : colorsPrototypes) {
			if (color.getType().equals(type)) {
				return color.clone();
			}
		}
		System.out.println("Color Doesn't exist");
		return null;
	}

}
