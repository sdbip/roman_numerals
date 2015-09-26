package kata;

public enum RomanNumeral {
	I("I", 1),
	IV("IV", 4),
	V("V", 5),
	X("X", 10),
	L("L", 50);

	public static final RomanNumeral[] ALL_BY_DESC_VALUE = { L, X, V, IV, I };

	public final String numeral;
	public final int value;

	RomanNumeral(String numeral, int value) {
		this.numeral = numeral;
		this.value = value;
	}
}
