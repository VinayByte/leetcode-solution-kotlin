class Solution {
    fun isValid(s: String): Boolean {
        val map = mutableMapOf<Char, Char>()
        map['('] = ')'
        map['{'] = '}'
        map['['] = ']'

        val stack = Stack<Char>()
        for (ch in s.iterator()) {
            if (map.contains(ch)) {
                stack.push(ch)
            } else if (!stack.empty() && map[stack.peek()] == ch) {
                stack.pop()
            } else {
                return false
            }
        }
        return stack.empty()
    }
}
