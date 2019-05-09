class RomanNumerals {
    fun convert(number: Int): String {
        val numbers = hashMapOf<Int, String>(
            1 to "I",
            4 to "IV",
            5 to "V"
        )
        if (numbers.contains(number)){
            return numbers.get(number)!!
        }
        return "I" + convert(number-1)
    }


}
