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

	@Test
	public void romanForty() {
		assertEquals(40, fromRoman("XL"));
	}


	private int fromRoman(String roman) {
		if (RomanNumeral.I.numeral.equals(roman))
			return RomanNumeral.I.value;
		if (RomanNumeral.XL.numeral.equals(roman))
			return RomanNumeral.XL.value;
		return 0;
	}

}
