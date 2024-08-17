//https://leetcode.com/problems/unique-number-of-occurrences/description/
class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val map = mutableMapOf<Int, Int>()
        for(num in arr){
            map[num] = map.getOrDefault(num, 0) + 1
        }
        return map.values.toSet().size == map.size
    }
}
