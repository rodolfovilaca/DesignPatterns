package solution.utils;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Utils {
	public final static DateTimeFormatter dtf = new DateTimeFormatterBuilder().appendPattern("hh:mma").toFormatter();
	public final static String REGEX_NUMBERS = "[0-9]+";
	public final static String REGEX_SELECT_ALL_AFTER_DIGIT = "[0-9]+.*$";
	public final static String REGEX_NOT_NUMBERS = "[^0-9]";
	public final static String REGEX_CHARACTERS = "[a-zA-Z]+";
	
	public static String replaceLast(String text, String regex, String replacement) {
		return text.replaceFirst("(?s)(.*)" + regex, "$1" + replacement);
	}
}
