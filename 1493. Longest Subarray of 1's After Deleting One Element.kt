class Solution {
    fun longestSubarray(nums: IntArray): Int {
        var maxLength = 0
        var left = 0
        var zeros = 0

        for (i in nums.indices){
            if(nums[i] == 0){
                zeros ++
            }
            while(zeros > 1){
                if(nums[left] == 0){
                    zeros --
                }
                left++
            }
            maxLength = maxOf(maxLength, i - left)
        }
        return maxLength
    }

}
