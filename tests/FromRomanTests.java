import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FromRomanTests {

	@Test
	public void fromEmptyRomanStringReturnsZero() {
		assertEquals(0, fromRoman(""));
	}

	@Test
	public void romanOne() {
		assertEquals(1, fromRoman("I"));
	}

	private int fromRoman(String roman) {
		if (roman.equals("I"))
			return 1;
		return 0;
	}

}
