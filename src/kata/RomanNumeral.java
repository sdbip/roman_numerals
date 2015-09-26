package kata;

public enum RomanNumeral {
	/** The smallest numeral; the only one with no subtractor */
	I('I', 1),
	V('V', 5,    I),
	X('X', 10,   I),
	L('L', 50,   X),
	C('C', 100,  X),
	D('D', 500,  C),
	M('M', 1000, C);

	final static RomanNumeral[] NUMERALS_HIGH_TO_LOW = {
			M, D, C, L, X, V, I
	};

	final char c;
	final int value;

	/**
	 * Another numeral that might be placed to the left of this one
	 * and would be subtracted. Is null for RomanNumeral.I
	 * @see :RomanNumeral.I
	 */
	final RomanNumeral subtractor;

	RomanNumeral(char c, int value, RomanNumeral subtractor) {
		this.c = c;
		this.value = value;
		this.subtractor = subtractor;
	}


	RomanNumeral(char c, int value) {
		this(c, value, null);
	}

	static RomanNumeral fromCharacter(char c) {
		for (RomanNumeral numeral : NUMERALS_HIGH_TO_LOW) {
			if (numeral.c == c) return numeral;
		}
		return null;
	}

}
