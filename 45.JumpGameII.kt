/*
https://leetcode.com/problems/jump-game-ii/description
time: 0(n) space:0(1)
greedy approach
*/
fun jump(nums: IntArray): Int {
    if (nums.size == 1) return 0
    var totalJump = 0
    var currentEndIndex = 0
    var maxJump = 0

    for (i in nums.indices) {
        maxJump = maxOf(maxJump, i + nums[i])
        if (i == currentEndIndex) {
            totalJump++
            currentEndIndex = maxJump
            if (maxJump >= nums.size - 1) {
                return totalJump
            }
        }
    }
    return totalJump
}
