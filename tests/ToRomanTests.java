import kata.RomanNumeral;
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

	@Test
	public void romanForFiftyOne() {
		assertRomanFromValue("LI", 51);
	}


	public void assertRomanFromValue(String expected, int value) {
		assertEquals(expected, roman(value));
	}


	private static String roman(int value) {
		for (RomanNumeral numeral : RomanNumeral.ALL_BY_DESC_VALUE) {
			if (value >= numeral.value)
				return numeral.numeral + roman(value - numeral.value);
		}
		return "";
	}

}
