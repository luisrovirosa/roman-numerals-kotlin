class RomanNumerals {
    fun convert(number: Int): String {
        val numbers = hashMapOf<Int, String>(
            1 to "I",
            2 to "II",
            3 to "III",
            4 to "IV"
        )
        return numbers.getOrDefault(number, "")
    }


}
