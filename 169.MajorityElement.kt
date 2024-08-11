//Boyer-Moore Voting Algorithm
//time complexity:O(n), space: O(1)
fun majorityElement(nums: IntArray): Int {
    var count = 1
    var majority = nums[0]
    for (i in 1 until nums.size) {
        if (nums[i] == majority) {
            count++
        } else {
            if (count > 1) {
                count--
            } else {
                majority = nums[i]
            }
        }
    }
    count = 0
    for (j in nums) {
        if (j == majority) {
            count++
        }
    }

    return if (count >= nums.size / 2 + 1) {
        majority
    } else {
        -1
    }

}
