class RomanNumerals {
    fun convert(number: Int): String {
        val numbers = linkedMapOf<Int, String>(
            1 to "I",
            4 to "IV",
            5 to "V",
            9 to "IX",
            10 to "X"
        )
        if (numbers.contains(number)) {
            return numbers.get(number)!!
        }
        if (number > 10) {
            return numbers.get(10) + convert(number - 10)
        }
        if (number > 5) {
            return numbers.get(5) + convert(number - 5)
        }
        return numbers.get(1) + convert(number - 1)
    }


}
