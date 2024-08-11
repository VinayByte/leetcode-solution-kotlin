fun removeDuplicates(nums: IntArray): Int {
    var count = 0
    for (num in nums) {
        if (count < 2 || num != nums[count - 2]) {
            nums[count++] = num
        }
    }
    return count
}
