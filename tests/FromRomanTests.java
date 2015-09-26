import kata.RomanNumeral;
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
		if (RomanNumeral.I.numeral.equals(roman))
			return RomanNumeral.I.value;
		return 0;
	}

}
