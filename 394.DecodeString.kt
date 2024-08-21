//https://leetcode.com/problems/decode-string/description
fun decodeString(s: String): String {
    val stack = mutableListOf<String>()
    var currNum = 0
    var currString = ""

    for (char in s) {
        when (char) {
            in '0'..'9' -> {
                currNum = currNum * 10 + (char - '0')
            }

            '[' -> {
                stack.add(currString)
                stack.add(currNum.toString())
                currNum = 0
                currString = ""
            }

            ']' -> {
                val num = stack.removeLast().toInt()
                val prevString = stack.removeLast()
                currString = prevString + currString.repeat(num)
            }

            else -> currString += char

        }
    }
    return currString

}
