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


	private String roman(int value) {
		if (value == 1) return "I";
		return "";
	}

}
