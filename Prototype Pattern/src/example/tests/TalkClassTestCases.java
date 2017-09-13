package tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import solution.models.Talk;

public class TalkClassTestCases {

	@Test
	public void testValidTalk() {
		String line = "Agile with XP (Extreme Programing) 60min";
		String titleExpected = "Agile with XP (Extreme Programing)";
		Talk talk = new Talk(line);
		assertEquals(talk.getTitle(), titleExpected);
		assertEquals(talk.getDuration(), 60);
	}

	@Test
	public void testValidLightning() {
		String line = "Agile with XP (Extreme Programing) lightning";
		String titleExpected = "Agile with XP (Extreme Programing)";
		Talk talk = new Talk(line);
		assertEquals(talk.getTitle(), titleExpected);
		assertEquals(talk.getDuration(), 5);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testEmptyInput() {
		String line = "";
		new Talk(line);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidInput() {
		String line = "Agile with XP (Extreme Programing)";
		new Talk(line);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidDurationTalk() {
		String line = "Agile with XP (Extreme Programing) 360min";
		new Talk(line);
	}

	@Test
	public void testGenerateList() {
		String[] talks = {"Writing Fast Tests Against Enterprise Rails 60min",
				"Overdoing it in Python 45min",
				"Lua for the Masses 30min",
				 "Ruby Errors from Mismatched Gem Versions 45min",
				 "Common Ruby Errors 45min",
				 "Rails for Python Developers lightning",
				 "Communicating Over Distance 60min",
				 "Accounting-Driven Development 45min",
				 "Woah 30min",
				 "Sit Down and Write 30min",
				 "Pair Programming vs Noise 45min",
				 "Rails Magic 60min",
				 "Ruby on Rails: Why We Should Move On 60min",
				 "Clojure Ate Scala (on my project) 45min",
				 "Programming in the Boondocks of Seattle 30min",
				 "Ruby vs. Clojure for Back-End Development 30min",
				 "Ruby on Rails Legacy App Maintenance 60min",
				 "A World Without HackerNews 30min",
				 "User Interface CSS in Rails Apps 30min"};
		Talk[] actualArr = Talk.generateList(talks).toArray(new Talk[talks.length]);
		Talk[] expectedArr = {new Talk("Writing Fast Tests Against Enterprise Rails 60min"),
				new Talk("Overdoing it in Python 45min"),
				new Talk("Lua for the Masses 30min"),
				new Talk("Ruby Errors from Mismatched Gem Versions 45min"),
				new Talk("Common Ruby Errors 45min"),
				new Talk("Rails for Python Developers lightning"),
				new Talk("Communicating Over Distance 60min"),
				new Talk("Accounting-Driven Development 45min"),
				new Talk("Woah 30min"),
				new Talk("Sit Down and Write 30min"),
				new Talk("Pair Programming vs Noise 45min"),
				new Talk("Rails Magic 60min"),
				new Talk("Ruby on Rails: Why We Should Move On 60min"),
				new Talk("Clojure Ate Scala (on my project) 45min"),
				new Talk("Programming in the Boondocks of Seattle 30min"),
				new Talk("Ruby vs. Clojure for Back-End Development 30min"),
				new Talk("Ruby on Rails Legacy App Maintenance 60min"),
				new Talk("A World Without HackerNews 30min"),
				new Talk("User Interface CSS in Rails Apps 30min")};
		assertArrayEquals(expectedArr,actualArr);
	}
}
