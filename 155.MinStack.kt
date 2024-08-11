class MinStack {
    val stack = Stack<Int>()
    val minValStack = Stack<Int>()

    fun push(`val`: Int) {
        if (minValStack.isEmpty() || `val` <= minValStack.peek()) {
            minValStack.push(`val`)
        }
        stack.push(`val`)
    }

    fun pop() {
        if (stack.peek() == minValStack.peek()) {
            minValStack.pop()
        }
        stack.pop()
    }

    fun top(): Int {
        return stack.peek()
    }

    fun getMin(): Int {
        return minValStack.peek()
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */
