class Solution {
    fun increasingTriplet(nums: IntArray): Boolean {
        var firstSmallest = Int.MAX_VALUE
        var secondSmallest = Int.MAX_VALUE //larger than first
        for(num in nums){
            if(num <= firstSmallest){
                firstSmallest = num
            } else if(num <= secondSmallest){
                secondSmallest = num
            } else {
                return true
            }
        }
        return false
    }
}
