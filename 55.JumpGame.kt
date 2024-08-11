//time complexity:O(n), space: O(1)
fun canJump(nums: IntArray): Boolean {
    var max = 0
    for (i in nums.indices) {
        if (max < i) return false
        max = Math.max(max, i + nums[i])
    }
    return true
}
