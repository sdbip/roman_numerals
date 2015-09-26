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


	@Test
	public void accept1066() {
		assertEquals(1066, fromRoman("MLXVI"));
	}

	@Test
	public void accept1989() {
		assertEquals(1989, fromRoman("MCMLXXXIX"));
	}


	private int fromRoman(String roman) {
		for (RomanNumeral numeral : RomanNumeral.ALL_BY_DESC_VALUE) {
			if (roman.startsWith(numeral.toString()))
				return numeral.value + fromRoman(roman.substring(numeral.toString().length()));
		}
		return 0;
	}

}
