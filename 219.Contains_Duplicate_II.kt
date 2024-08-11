/*
https://leetcode.com/problems/contains-duplicate-ii/description/
*/
fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val map = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val key = nums[i]
        if (map.containsKey(key) && i - map[key]!! <= k) return true
        map[key] = i
    }
    return false
}
