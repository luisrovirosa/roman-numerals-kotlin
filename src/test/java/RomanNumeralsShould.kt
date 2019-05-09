import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RomanNumeralsShould {
    @Test
    fun `return I for number 1`(){
        val conversor = RomanNumerals()

        val inRoman = conversor.convert(1)

        assertEquals("I", inRoman)
    }
}