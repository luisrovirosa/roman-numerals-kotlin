class RomanNumerals {
    fun convert(number: Int): String {
        val numbers = hashMapOf<Int, String>(
            1 to "I",
            4 to "IV",
            5 to "V",
            9 to "IX",
            10 to "X",
            11 to "XI",
            12 to "XII",
            13 to "XIII"
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
