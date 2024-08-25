class Solution {
    fun missingNumber(nums: IntArray): Int {
        val n = nums.size
        val expextedSum = n*(n+1)/2
        val actualSum = nums.sum()
        return expextedSum - actualSum  
    }
}
