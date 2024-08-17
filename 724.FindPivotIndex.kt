//https://leetcode.com/problems/find-pivot-index/description
class Solution {
    fun pivotIndex(nums: IntArray): Int {
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
