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

	@Test
	public void romanFiftyFive() {
		assertEquals(55, fromRoman("LV"));
	}


	private int fromRoman(String roman) {
		for (RomanNumeral numeral : RomanNumeral.ALL_BY_DESC_VALUE) {
			if (roman.startsWith(numeral.numeral))
				return numeral.value + fromRoman(roman.substring(numeral.numeral.length()));
		}
		return 0;
	}

}
