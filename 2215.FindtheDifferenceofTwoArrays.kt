//https://leetcode.com/problems/find-the-difference-of-two-arrays/description
fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val map1 = nums1.groupBy{it}
        val map2 = nums2.groupBy{it}

        val diff1 = map1.filter{it.key !in map2}.map{it.key}
        val diff2 = map2.filter{it.key !in map1}.map{it.key}
        return listOf(diff1, diff2)
   }
