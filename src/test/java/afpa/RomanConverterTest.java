package afpa;

import static afpa.RomanConverter.romanToArabic;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RomanConverterTest {

	@ParameterizedTest
	@CsvSource({ "MCMLIV,1954", "XXXIX,39", "CCXLVI,246", "DCCLXXXIX,789", "X,10", "MMCDXXI,2421",
			"CLX,160", "CCVII,207", "MIX,1009", "MMMCMXCIX,3999", "MMXIV,2014", " MCMXVIII,1918" })
	void test(String romanNum, int arabicNum) {

		assertThat(romanToArabic(romanNum)).isEqualTo(arabicNum);

	}

}
