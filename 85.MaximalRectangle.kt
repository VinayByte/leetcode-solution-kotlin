class Solution {
    fun maximalRectangle(matrix: Array<CharArray>): Int {
        if (matrix.isEmpty() || matrix[0].isEmpty()) {
            return 0
        }
        val heights = IntArray(matrix[0].size)
        var maxArea = 0
        for (row in matrix) {
            for ((index, cell) in row.withIndex()) {
                heights[index] = if (cell == '1') heights[index] + 1 else 0
            }
            maxArea = maxOf(maxArea, maxRectangleInHistogram(heights))
        }
        return maxArea
    }
    fun maxRectangleInHistogram(heights: IntArray): Int {
        val stack = mutableListOf<Int>()
        var index = 0
        var maxArea = 0

        while (index < heights.size) {
            if (stack.isEmpty() || heights[index] >= heights[stack.last()]) {
                stack.add(index++)
            } else {
                val top = stack.removeAt(stack.size - 1)
                val width = if (stack.isEmpty()) index else index - stack.last() - 1
                maxArea = maxOf(maxArea, heights[top] * width)
            }
        }
        while (stack.isNotEmpty()) {
            val top = stack.removeAt(stack.size - 1)
            val width = if (stack.isEmpty()) index else index - stack.last() - 1
            maxArea = maxOf(maxArea, heights[top] * width)
        }
        return maxArea
    }
}
