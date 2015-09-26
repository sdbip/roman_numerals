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


	public void assertRomanFromValue(String expected, int value) {
		assertEquals(expected, roman(value));
	}


	private String roman(int value) {
		if (value == 0) return "";
		if (value == 5) return "V";
		if (value == 4) return "IV";
		return roman(value - 1) + "I";
	}

}
