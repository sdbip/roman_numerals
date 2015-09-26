import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToRomanTests {

	@Test
	public void romanHasNoZero() {
		assertEquals("", roman(0));
	}

	@Test
	public void romanForOne() {
		assertEquals("I", roman(1));
	}

	@Test
	public void romanForFive() {
		assertEquals("V", roman(5));
	}


	private String roman(int value) {
		if (value == 1) return "I";
		if (value == 5) return "V";
		return "";
	}

}
