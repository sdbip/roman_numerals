package kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsFromValueTests {

	@Test
	public void romanFrom1EqualsI() {
		assertNumeralEquals("I", 1);
	}

	@Test
	public void romanFrom3EqualsIII() {
		assertNumeralEquals("III", 3);
	}

	@Test
	public void romanFor5EqualsV() {
		assertNumeralEquals("V", 5);
	}

	@Test
	public void romanFor6IsVI() {
		assertNumeralEquals("VI", 6);
	}

	@Test
	public void romanFor10IsX() {
		assertNumeralEquals("X", 10);
	}

	@Test
	public void romanFor50IsL() {
		assertNumeralEquals("L", 50);
	}

	@Test
	public void romanFor100IsC() {
		assertNumeralEquals("C", 100);
	}

	@Test
	public void romanFor500IsD() {
		assertNumeralEquals("D", 500);
	}

	@Test
	public void romanFor1000IsM() {
		assertNumeralEquals("M", 1000);
	}

	@Test
	public void romanFor2322IsMMCCCXXII() {
		assertNumeralEquals("MMCCCXXII", 2322);
	}

	@Test
	public void romanFor4IsIV() {
		assertNumeralEquals("IV", 4);
	}

	@Test
	public void romanFor9IsIX() {
		assertNumeralEquals("IX", 9);
	}

	@Test
	public void romanFor40IsXL() {
		assertNumeralEquals("XL", 40);
	}

	@Test
	public void romanFor45IsXLV() {
		assertNumeralEquals("XLV", 45);
	}

	@Test
	public void romanFor90IsXC() {
		assertNumeralEquals("XC", 90);
	}

	@Test
	public void romanFor400IsCD() {
		assertNumeralEquals("CD", 400);
	}

	@Test
	public void romanFor900IsCM() {
		assertNumeralEquals("CM", 900);
	}

	@Test
	public void roman1066() {
		assertNumeralEquals("MLXVI", 1066);
	}

	@Test
	public void roman1989() {
		assertNumeralEquals("MCMLXXXIX", 1989);
	}

	private void assertNumeralEquals(String expected, int value) {
		RomanNumeralString roman = new RomanNumeralString(value);
		assertEquals(expected, roman.toString());
	}

}
