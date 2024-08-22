class Solution {
    fun mySqrt(x: Int): Int {
        if (x < 2) {
            return x
        }
        var left = 1
        var right = x / 2

        while (left <= right) {
            val mid = left + (right - left) / 2
            val num = mid.toLong() * mid

            if (num == x.toLong()) {
                return mid
            } else if (num < x) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return right
    }
}
