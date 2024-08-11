/**
 * Created by VINAY on 11-08-2024.
 * Github:@vinayByte
 *
 */
//O(n^2)
fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableSetOf<List<Int>>()
    val n = nums.size
    val sortedNums = nums.sorted()
    for (i in 0 until n) {
        var left = i + 1
        var right = n - 1
        while (left < right) {
            var sum = sortedNums[i] + sortedNums[left] + sortedNums[right]
            if (sum == 0) {
                val triplet = listOf(sortedNums[i], sortedNums[left], sortedNums[right])
                result.add(triplet)
                left++
                right--
            } else if (sum < 0) {
                left++
            } else {
                right--
            }
        }
    }

    return result.toList()
}

//Brute Force: O(n3)
fun threeSum1(nums: IntArray): List<List<Int>> {
    val result = mutableSetOf<List<Int>>()
    val n = nums.size

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            for (k in j + 1 until n) {
                if ((nums[i] + nums[j] + nums[k] == 0) && (i != j && i != k && j != k)) {
                    val triplet = listOf(nums[i], nums[j], nums[k]).sorted()
                    result.add(triplet)
                }
            }
        }
    }
    return result.toList()
}
