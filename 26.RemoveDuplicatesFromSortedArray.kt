//time complexity:O(n), space: O(1)
fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return nums.size
    var j = 0
    for (i in 0 until nums.size - 1) {
        if (nums[i] != nums[i + 1]) {
            nums[j] = nums[i]
            j++
        }
    }
    nums[j] = nums[nums.size - 1]
    return j + 1

}
