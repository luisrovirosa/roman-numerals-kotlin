import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

class RomanNumeralsShould {
    @ParameterizedTest
    @CsvSource(
        "1, I"
    )
    fun `return I for number 1`(number: Int, expectedValue: String){
        val converter = RomanNumerals()

        val inRoman = converter.convert(number)

        assertEquals(expectedValue, inRoman)
    }
}