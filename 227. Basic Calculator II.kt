class Solution {
    fun calculate(s: String): Int {
        val stack = mutableListOf<Int>()
        var num = 0
        var sign = '+'

        for (char in s) {
            if (char.isDigit()) {
                num = num * 10 + (char - '0')
            } else if (char != ' ') {
                when (sign) {
                    '+' -> stack.add(num)
                    '-' -> stack.add(-num)
                    '*' -> stack.add(stack.removeAt(stack.size - 1) * num)
                    '/' -> stack.add(stack.removeAt(stack.size - 1) / num)
                }
                sign = char
                num = 0
            }
        }

        when (sign) {
            '+' -> stack.add(num)
            '-' -> stack.add(-num)
            '*' -> stack.add(stack.removeAt(stack.size - 1) * num)
            '/' -> stack.add(stack.removeAt(stack.size - 1) / num)
        }
        return stack.sum()
    }
}
