package kata;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsValueTests {

	@Test
	public void fromRomanIReturnsOne() {
		assertNumeralEquals(1, "I");
	}

	@Test
	public void fromRomanIIReturnsTwo() {
		assertNumeralEquals(2, "II");
	}

	@Test
	public void fromRomanVReturnsFive() {
		assertNumeralEquals(5, "V");
	}

	@Test
	public void fromRomanIVReturnsFour() {
		assertNumeralEquals(4, "IV");
	}

	@Test
	public void fromRomanXReturnsTen() {
		assertNumeralEquals(10, "X");
	}

	@Test
	public void fromRomanIXReturnsNine() {
		assertNumeralEquals(9, "IX");
	}

	@Test
	public void romanLEquals50() {
		assertNumeralEquals(50, "L");
	}

	@Test
	public void romanCEquals100() {
		assertNumeralEquals(100, "C");
	}

	@Test
	public void romanDEquals500() {
		assertNumeralEquals(500, "D");
	}

	@Test
	public void romanMEquals1000() {
		assertNumeralEquals(1000, "M");
	}

	@Test
	public void romanXLEquals40() {
		assertNumeralEquals(40, "XL");
	}

	@Test
	public void romanXCEquals90() {
		assertNumeralEquals(90, "XC");
	}

	@Test
	public void roman1066() {
		assertNumeralEquals(1066, "MLXVI");
	}

	@Test
	public void roman1989() {
		assertNumeralEquals(1989, "MCMLXXXIX");
	}

	private static void assertNumeralEquals(int expected, String numeral) {
		assertEquals(expected, new RomanNumeralString(numeral).value());
	}
}
