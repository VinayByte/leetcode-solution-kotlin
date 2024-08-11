/*
https://leetcode.com/problems/two-sum/description/
*/
fun twoSum(nums: IntArray, target: Int): IntArray {
    val result = IntArray(2)
    val map: MutableMap<Int, Int> = HashMap()
    for( i in nums.indices){
        if(map.containsKey(target - nums[i])){
            result[0] = i
            result[1] = map[target- nums[i]]!!
            return result
        }
        map[nums[i]] = i
    }
    return result
}
