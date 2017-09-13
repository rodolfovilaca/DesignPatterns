package tests;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import solution.models.Conference;

public class ConferenceClassTestCases {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void testValidInput() {
		new Conference("Writing Fast Tests Against Enterprise Rails 60min\n"
				+ "Overdoing it in Python 45min\n"
				+ "Lua for the Masses 30min\n"
				+ "Ruby Errors from Mismatched Gem Versions 45min\n"
				+ "Common Ruby Errors 45min\n"
				+ "Rails for Python Developers lightning\n"
				+ "Communicating Over Distance 60min\n"
				+ "Accounting-Driven Development 45min\n"
				+ "Woah 30min\n"
				+ "Sit Down and Write 30min\n"
				+ "Pair Programming vs Noise 45min\n"
				+ "Rails Magic 60min\n"
				+ "Ruby on Rails: Why We Should Move On 60min\n"
				+ "Clojure Ate Scala (on my project) 45min\n"
				+ "Programming in the Boondocks of Seattle 30min\n"
				+ "Ruby vs. Clojure for Back-End Development 30min\n"
				+ "Ruby on Rails Legacy App Maintenance 60min\n"
				+ "A World Without HackerNews 30min\n"
				+ "User Interface CSS in Rails Apps 30min\n").print();
		
		String expected = "Track 1:\r\n"
				+ "09:00AM Ruby Errors from Mismatched Gem Versions 45 min\r\n"
				+ "09:45AM Lua for the Masses 30 min\r\n"
				+ "10:15AM Overdoing it in Python 45 min\r\n"
				+ "11:00AM Writing Fast Tests Against Enterprise Rails 60 min\r\n"
				+ "12:00PM Lunch\r\n"
				+ "01:00PM Programming in the Boondocks of Seattle 30 min\r\n"
				+ "01:30PM Sit Down and Write 30 min\r\n"
				+ "02:00PM Woah 30 min\r\n"
				+ "02:30PM Accounting-Driven Development 45 min\r\n"
				+ "03:15PM Communicating Over Distance 60 min\r\n"
				+ "04:15PM Common Ruby Errors 45 min\r\n"
				+ "05:00PM Networking Event\r\n"
				+ "Track 2:\r\n"
				+ "09:00AM Ruby vs. Clojure for Back-End Development 30 min\r\n"
				+ "09:30AM Clojure Ate Scala (on my project) 45 min\r\n"
				+ "10:15AM Rails Magic 60 min\r\n"
				+ "11:15AM Pair Programming vs Noise 45 min\r\n"
				+ "12:00PM Lunch\r\n"
				+ "01:00PM User Interface CSS in Rails Apps 30 min\r\n"
				+ "01:30PM A World Without HackerNews 30 min\r\n"
				+ "02:00PM Ruby on Rails Legacy App Maintenance 60 min\r\n"
				+ "03:00PM Ruby on Rails: Why We Should Move On 60 min\r\n"
				+ "04:00PM Rails for Python Developers lightning\r\n"
				+ "05:00PM Networking Event\r\n";
		String actual =  outContent.toString();
		assertEquals(expected, actual);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidInputException() {
		new Conference("Writing Fast Tests Against Enterprise Rails 60min\n"
				+ "50\n"
				+ "Lua for the Masses 30min\n"
				+ "Ruby Errors from Mismatched Gem Versions 45min\n"
				+ "kkkkkkkkkkkkk\n"
				+ "Rails for Python Developers lightning\n"
				+ "Communicating Over Distance 60min\n"
				+ "Accounting-Driven Development 45min\n"
				+ "Woah 30min\n"
				+ "Sit Down and Write 30min\n"
				+ "Pair Programming vs Noise 45min\n"
				+ "Rails Magic 60min\n"
				+ "Ruby on Rails: Why We Should Move On 60min\n"
				+ "Clojure Ate Scala (on my project) 45min\n"
				+ "Programming in the Boondocks of Seattle 30min\n"
				+ "Ruby vs. Clojure for Back-End Development 30min\n"
				+ "Ruby on Rails Legacy App Maintenance 60min\n"
				+ "A World Without HackerNews 30min\n"
				+ "User Interface CSS in Rails Apps 30min\n").print();
		
		String actual =  outContent.toString();
		
		assertEquals("Talk '50' é inválido, deve conter o título e horario da Talk.", actual);
	}
	
	@Test
	public void testInvalidInput() {
		try {
			new Conference("Writing Fast Tests Against Enterprise Rails 60min\n"
					+ "50\n"
					+ "Lua for the Masses 30min\n"
					+ "Ruby Errors from Mismatched Gem Versions 45min\n"
					+ "kkkkkkkkkkkkk\n"
					+ "Rails for Python Developers lightning\n"
					+ "Communicating Over Distance 60min\n"
					+ "Accounting-Driven Development 45min\n"
					+ "Woah 30min\n"
					+ "Sit Down and Write 30min\n"
					+ "Pair Programming vs Noise 45min\n"
					+ "Rails Magic 60min\n"
					+ "Ruby on Rails: Why We Should Move On 60min\n"
					+ "Clojure Ate Scala (on my project) 45min\n"
					+ "Programming in the Boondocks of Seattle 30min\n"
					+ "Ruby vs. Clojure for Back-End Development 30min\n"
					+ "Ruby on Rails Legacy App Maintenance 60min\n"
					+ "A World Without HackerNews 30min\n"
					+ "User Interface CSS in Rails Apps 30min\n").print();
		} catch (IllegalArgumentException e) {
			String actual =  outContent.toString();
			assertEquals("Talk '50' é inválido, deve conter o título e horario da Talk.\r\n", actual);
		}
	}
}
