package kata;

public enum RomanNumeral {
	I("I", 1),
	IV("IV", 4),
	V("V", 5),
	IX("IX", 9),
	X("X", 10),
	XL("XL", 40),
	L("L", 50),
	XC("XC", 90),
	C("C", 100),
	CD("CD", 400),
	D("D", 500),
	CM("CM", 900),
	M("M", 1000);

	public static final RomanNumeral[] ALL_BY_DESC_VALUE = {
			M, CM, D, CD, C, XC, L, XL, X, IX, V, IV, I
	};

	public final String numeral;
	public final int value;

	RomanNumeral(String numeral, int value) {
		this.numeral = numeral;
		this.value = value;
	}
}
