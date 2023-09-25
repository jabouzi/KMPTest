fun englishNumberToArabicNumber(number: Int): String {
    val arabicNumber = mutableListOf<String>()
    for (element in number.toString()) {
        when (element) {
            '1' -> arabicNumber.add("١")
            '2' -> arabicNumber.add("٢")
            '3' -> arabicNumber.add("٣")
            '4' -> arabicNumber.add("٤")
            '5' -> arabicNumber.add("٥")
            '6' -> arabicNumber.add("٦")
            '7' -> arabicNumber.add("٧")
            '8' -> arabicNumber.add("٨")
            '9' -> arabicNumber.add("٩")
            else -> arabicNumber.add("٠")
        }
    }
    val str= arabicNumber.toString()
        .replace("[", "")
        .replace("]", "")
        .replace(",", "")
        .replace(" ", "")

    return str


}