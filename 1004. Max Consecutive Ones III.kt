class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var maxNumConsecutiveOne = 0
        var windowStart = 0
        var zerosInWindow = 0
        for (windowEnd in nums.indices) {
            if (nums[windowEnd] == 0) {
                zerosInWindow++
            }
            while (zerosInWindow > k) {
                if (nums[windowStart] == 0) {
                    zerosInWindow--
                }
                windowStart++
            }
            maxNumConsecutiveOne = maxOf(maxNumConsecutiveOne, windowEnd - windowStart + 1)
        }
        return maxNumConsecutiveOne
    }
}
