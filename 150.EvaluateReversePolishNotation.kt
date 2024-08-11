
//time complexity:O(n), space: O(n)
fun evalRPN(tokens: Array<String>): Int {
    val operand = setOf("+", "-", "*", "/")
    val stack = Stack<Int>()

    for (token in tokens) {
        if (token in operand) {
            val secondOperand = stack.pop()
            val firstOperand = stack.pop()
            val res = when (token) {
                "+" -> firstOperand + secondOperand
                "-" -> firstOperand - secondOperand
                "*" -> firstOperand * secondOperand
                "/" -> firstOperand / secondOperand
                else -> 0
            }
            stack.push(res)
        } else {
            stack.push(token.toInt())
        }
    }
    return stack.pop()
}
