//https://leetcode.com/problems/removing-stars-from-a-string/description
fun removeStars(s: String): String {
    val stack = Stack<Char>()
    for (char in s) {
        if (char == '*') {
            stack.pop()
        } else {
            stack.push(char)
        }
    }
    return stack.joinToString("")
}
