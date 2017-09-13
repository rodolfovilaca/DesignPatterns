package solution.models;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import solution.utils.ISubsetSum;
import solution.utils.Utils;

public class Talk implements ISubsetSum{
	private String title;
	private int duration;
	private LocalTime time = LocalTime.parse("00:00");

	public Talk(String line) {
		line = Utils.replaceLast(line, "lightning", "5min");
		line = Utils.replaceLast(line, "min", "");
		Matcher containsNumbers = Pattern.compile(Utils.REGEX_NUMBERS).matcher(line);
		Matcher containsChars = Pattern.compile(Utils.REGEX_CHARACTERS).matcher(line);
		if (line.length() > 2 && containsNumbers.find() && containsChars.find()) {
			String duration = line.replaceAll(Utils.REGEX_NOT_NUMBERS, "");
			String title = line.replaceAll(Utils.REGEX_SELECT_ALL_AFTER_DIGIT, "");
			if (Integer.parseInt(duration) > 240) {
				System.out.println("Uma Talk não deve durar mais que 240 minutos, pois não encaixará nas Sessions");
				throw new IllegalArgumentException();
			} else {
				this.duration = Integer.parseInt(duration);
				this.title = title.trim();
			}
		} else {
			System.out.println("Talk '" + line + "' é inválido, deve conter o título e horario da Talk.");
			throw new IllegalArgumentException();
		}

	}

	public String getTitle() {
		return title;
	}

	public int getDuration() {
		return duration;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public LocalTime getTime() {
		return time;
	}

	@Override
	public String toString() {
		if (duration == 5) {
			return Utils.dtf.format(time) + " " + title + " lightning";
		}
		return Utils.dtf.format(time) + " " + title + " " + duration + " min";
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Talk && title.equals(((Talk) obj).getTitle()) && duration == ((Talk) obj).getDuration();
	}

	public static List<Talk> generateList(String[] list) {
		List<Talk> talks = new ArrayList<>();
		for (int i = 0; i < list.length; i++) {
			list[i] = list[i].trim();
			if (!list[i].isEmpty()) {
				talks.add(new Talk(list[i]));
			}
		}
		return talks;
	}

	@Override
	public int getValue() {
		return this.duration;
	}
}
