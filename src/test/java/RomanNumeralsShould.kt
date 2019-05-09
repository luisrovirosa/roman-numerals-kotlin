import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

class RomanNumeralsShould {
    @ParameterizedTest
    @CsvSource(
        "1, I",
        "2, II",
        "3, III",
        "4, IV",
        "5, V",
        "6, VI",
        "7, VII",
        "8, VIII",
        "9, IX",
        "10, X",
        "11, XI",
        "12, XII",
        "13, XIII",
        "20, XX",
        "40, XL",
        "50, L",
        "90, XC",
        "100, C"
    )
    fun `return I for number 1`(number: Int, expectedValue: String){
        val converter = RomanNumerals()

        val inRoman = converter.convert(number)

        assertEquals(expectedValue, inRoman)
    }
}