class RomanNumerals {
    fun convert(number: Int): String {
        val numbers = hashMapOf<Int, String>(
            1 to "I",
            4 to "IV",
            5 to "V",
            9 to "IX",
            10 to "X"
        )
        if (numbers.contains(number)) {
            return numbers.get(number)!!
        }
        if (number > 5) {
            return "V" + convert(number - 5)
        }
        return "I" + convert(number - 1)
    }


}
