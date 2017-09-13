package tests;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Test;

import solution.models.Talk;
import solution.utils.SubsetSum;

public class SubsetSumTestCases {

	@Test
	public void testSubsetSumValidInput() {
		String[] lines = {"Writing Fast Tests Against Enterprise Rails 60min",
				"Overdoing it in Python 45min",
				"Lua for the Masses 30min",
				"Ruby Errors from Mismatched Gem Versions 45min",
				"Common Ruby Errors 45min",
				"Rails for Python Developers lightning",
				"Communicating Over Distance 60min",};
		List<Talk> talks = Talk.generateList(lines);
		Talk[] expectedArr = {new Talk("Ruby Errors from Mismatched Gem Versions 45 min"),
			new Talk("Lua for the Masses 30 min"),
			new Talk("Overdoing it in Python 45 min"),
			new Talk("Writing Fast Tests Against Enterprise Rails 60 min")};
		Talk[] actualArr = SubsetSum.getSubsetSum(talks, 180).toArray(new Talk[expectedArr.length]);
		assertArrayEquals(expectedArr, actualArr);
	}
	
	@Test
	public void testSubsetSumInvalidInput() {
		String[] lines = {""};
		List<Talk> talks = Talk.generateList(lines);
		Talk[] expectedArr = {};
		@SuppressWarnings("unchecked")
		Talk[] actualArr = ((List<Talk>) SubsetSum.getSubsetSum(talks, 180)).toArray(new Talk[expectedArr.length]);
		assertArrayEquals(expectedArr, actualArr);
	}
}
