//https://leetcode.com/problems/find-peak-element/description
class Solution {
    fun findPeakElement(nums: IntArray): Int {
        var low = 0
        var high = nums.size -1
        while(low < high){
            var mid = low +(high -low)/2
            if(nums[mid] > nums[mid+1]){
                high = mid
            } else {
                low = mid + 1
            }
        }
        return low
    }
}
