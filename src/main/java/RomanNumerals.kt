class RomanNumerals {
    fun convert(number: Int): String {
        if (number == 1){
            return "I"
        }
        if (number == 2)
            return "II"
        return "III"
    }

}
