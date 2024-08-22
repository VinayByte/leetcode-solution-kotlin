class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        nums.sort()
        var left = 0
        var right = nums.size -1
        var count = 0

        while(left < right){
            if(nums[left] + nums[right] == k){
                count++
                left++
                right--
            } else if(nums[left] + nums[right] < k){
                left++
            } else {
                right --
            }
        } 
        return count
    }
}
