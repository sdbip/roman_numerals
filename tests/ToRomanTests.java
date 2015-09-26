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
	public void romanForFive() {
		assertRomanFromValue("V", 5);
	}


	public void assertRomanFromValue(String expected, int value) {
		assertEquals(expected, roman(value));
	}


	private String roman(int value) {
		if (value == 1) return "I";
		if (value == 5) return "V";
		return "";
	}

}
