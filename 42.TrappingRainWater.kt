//two-pointer approach
//time complexity:O(n), space: O(1)
fun trap(height: IntArray): Int {
    var left = 0
    var right = height.size - 1
    var leftMax = 0
    var rightMax = 0
    var waterTrapped = 0

    while (left <= right) {
        if (height[left] <= height[right]) {
            if (height[left] >= leftMax) {
                leftMax = height[left]
            } else {
                waterTrapped += leftMax - height[left]
            }
            left++
        } else {
            if (height[right] >= rightMax) {
                rightMax = height[right]
            } else {
                waterTrapped += rightMax - height[right]
            }
            right--
        }
    }

    return waterTrapped
}

//time complexity:O(n), space: O(n)
fun trap1(height: IntArray): Int {
    val n = height.size
    val left = IntArray(n)
    val right = IntArray(n)
    left[0] = height[0]
    for (i in 1 until n) {
        left[i] = Math.max(left[i - 1], height[i])
    }
    right[n - 1] = height[n - 1]
    for (i in n - 2 downTo 0) {
        right[i] = Math.max(right[i + 1], height[i])
    }
    var waterTrapped = 0
    for (i in 0 until n) {
        waterTrapped += Math.min(left[i], right[i]) - height[i]
    }
    return waterTrapped
}
