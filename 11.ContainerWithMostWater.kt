//Two-pointer: time complexity O(n)
fun maxArea(height: IntArray): Int {
    var left = 0
    var right = height.size - 1
    var maxArea = 0

    while (left < right) {
        val minHeight = Math.min(height[left], height[right])
        val width = right - left
        val currentArea = minHeight * width
        maxArea = Math.max(maxArea, currentArea)
        if (height[left] < height[right]) {
            left++
        } else {
            right--
        }

    }
    return maxArea
}

//Brute force: time complexity O(n²)
fun maxArea1(height: IntArray): Int {
    var maxArea = 0
    for (i in height.indices) {
        for (j in i + 1 until height.size) {
            // Calculate the area for the pair (i, j)
            val width = j - i
            val minHeight = minOf(height[i], height[j])
            val area = width * minHeight

            // Update maxArea if this area is larger
            if (area > maxArea) {
                maxArea = area
            }
        }
    }

    return maxArea
}
