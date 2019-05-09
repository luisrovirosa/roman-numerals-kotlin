class RomanNumerals {
    fun convert(number: Int): String {
        val numbers = hashMapOf<Int, String>(
            1 to "I",
            4 to "IV",
            5 to "V",
            6 to "VI",
            7 to "VII"
        )
        if (numbers.contains(number)){
            return numbers.get(number)!!
        }
        return "I" + convert(number-1)
    }


}
