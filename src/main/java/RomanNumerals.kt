class RomanNumerals {
    fun convert(number: Int): String {
        val numbers = linkedMapOf<Int, String>(
            10 to "X",
            9 to "IX",
            5 to "V",
            4 to "IV",
            1 to "I"
        )
        if (numbers.contains(number)) {
            return numbers.get(number)!!
        }
        for (i in numbers.keys){
            if (number > i) {
                return numbers.get(i) + convert(number - i)
            }
        }
        return ""
    }



}
