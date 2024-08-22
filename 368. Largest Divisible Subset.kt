class Solution {
    fun largestDivisibleSubset(nums: IntArray): List<Int> {
        if (nums.isEmpty()) {
            return emptyList()
        }
        nums.sort()
        val dp = mutableListOf<List<Int>>()
        for (i in nums.indices) {
            var maxSubset = emptyList<Int>()
            for (j in 0 until i) {
                if (nums[i] % nums[j] == 0 && dp[j].size > maxSubset.size) {
                    maxSubset = dp[j]
                }
            }
            dp.add(maxSubset + listOf(nums[i]))
        }
        return dp.maxByOrNull { it.size } ?: emptyList()
    }
}
