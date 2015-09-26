import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToRomanTests {

	@Test
	public void romanHasNoZero() {
		assertRomanFromValue("", 0);
	}

	@Test
	public void romanForOne() {
		assertRomanFromValue("I", 1);
	}

	@Test
	public void romanForTwo() {
		assertRomanFromValue("II", 2);
	}

	@Test
	public void romanForFour() {
		assertRomanFromValue("IV", 4);
	}


	@Test
	public void romanForFive() {
		assertRomanFromValue("V", 5);
	}

	@Test
	public void romanForSix() {
		assertRomanFromValue("VI", 6);
	}

	@Test
	public void romanForTen() {
		assertRomanFromValue("X", 10);
	}

	@Test
	public void romanForFifteen() {
		assertRomanFromValue("XV", 15);
	}


	public void assertRomanFromValue(String expected, int value) {
		assertEquals(expected, roman(value));
	}


	private String roman(int value) {
		final String[] numerals = { "X", "V", "IV", "I" };
		final int[] numeralValues = { 10, 5, 4, 1 };
		if (value >= numeralValues[0]) return numerals[0] + roman(value - numeralValues[0]);
		if (value >= numeralValues[1]) return numerals[1] + roman(value - numeralValues[1]);
		if (value >= numeralValues[2]) return numerals[2] + roman(value - numeralValues[2]);
		if (value >= numeralValues[3]) return numerals[3] + roman(value - numeralValues[3]);
		return "";
	}

}
