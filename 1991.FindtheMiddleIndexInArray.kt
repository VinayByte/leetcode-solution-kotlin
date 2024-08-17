//https://leetcode.com/problems/find-the-middle-index-in-array/description/
class Solution {
    fun findMiddleIndex(nums: IntArray): Int {
        val sum = nums.sum()
        var leftSum = 0

        for(i in nums.indices){
            if(leftSum == sum -leftSum - nums[i]){
                return i
            }
            leftSum += nums[i]
        }
        return -1
    }
}
