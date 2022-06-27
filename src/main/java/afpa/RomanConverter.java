package afpa;

public final class RomanConverter {

	private RomanConverter() {

	}

	/**
	 * Roman numerals character in ascending order.
	 */
	private static final char[] ROMAN_NUMERALS = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };

	/**
	 * Roman numerals values in ascending order.
	 */
	private static final int[] ROMAN_NUMERALS_VALUES = { 1, 5, 10, 50, 100, 500, 1000 };

	public static int romanToArabic(final String romanString) {

		int output = 0;
		int topValue = 1;

		for (int i = romanString.length() - 1; i >= 0; i--) {

			final char c = romanString.charAt(i);
			final int value = getValue(c);

			if (value < topValue) {

				output -= value;

			} else {

				output += value;

				if (value > topValue) {

					topValue = value;

				}

			}

		}

		return output;

	}

	private static int getValue(final char c) {

		for (byte i = 0; i < ROMAN_NUMERALS.length; i++) {

			if (c == ROMAN_NUMERALS[i]) {

				return ROMAN_NUMERALS_VALUES[i];
			}

		}

		throw new RuntimeException("");
	}

}
