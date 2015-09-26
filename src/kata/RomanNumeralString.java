package kata;

import java.util.ArrayList;
import java.util.List;

import static kata.RomanNumeral.NUMERALS_HIGH_TO_LOW;

public class RomanNumeralString {

	final RomanNumeral[] numerals;

	public RomanNumeralString(String string) {
		numerals = new RomanNumeral[string.length()];
		for (int i = 0; i < numerals.length; i++) {
			numerals[i] = RomanNumeral.fromCharacter(string.charAt(i));
		}
	}

	public RomanNumeralString(int value) {
		List<RomanNumeral> builder = new ArrayList<>();

		for (RomanNumeral numeral : NUMERALS_HIGH_TO_LOW) {
			while (value >= numeral.value) {
				builder.add(numeral);
				value -= numeral.value;
			}

			if (numeral.subtractor != null && value >= numeral.value - numeral.subtractor.value) {
				builder.add(numeral.subtractor);
				builder.add(numeral);
				value -= numeral.value - numeral.subtractor.value;
			}
		}

		numerals = builder.toArray(new RomanNumeral[builder.size()]);

	}

	@Override public String toString() {
		StringBuilder builder = new StringBuilder();
		for (RomanNumeral numeral : numerals) {
			builder.append(numeral.c);
		}
		return builder.toString();
	}

	int value() {
		int sum = 0;
		for (int i = 0; i < numerals.length; i++) {
			RomanNumeral currentNumeral = numerals[i];
			if (isGreaterNumeralAt(i + 1, currentNumeral))
				sum -= currentNumeral.value;
			else
				sum += currentNumeral.value;
		}
		return sum;
	}

	private boolean isGreaterNumeralAt(int i, RomanNumeral numeral) {
		return i < numerals.length && numeral.value < numerals[i].value;
	}

}
