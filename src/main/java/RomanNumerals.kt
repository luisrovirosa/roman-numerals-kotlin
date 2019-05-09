class RomanNumerals {
    fun convert(number: Int): String {
        val numbers = arrayOf("I", "II", "III")
        return numbers[number - 1]
    }

}
