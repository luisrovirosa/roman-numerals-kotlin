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
        for (i in numbers.keys.reversed()){
            if (number > i) {
                return numbers.get(i) + convert(number - i)
            }
        }
        return ""
    }



}
