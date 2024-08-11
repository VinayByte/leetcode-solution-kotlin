//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description
fun twoSum(numbers: IntArray, target: Int): IntArray {
    var low = 0
    var high = numbers.size - 1
    while (numbers[low] + numbers[high] != target) {
        if (numbers[low] + numbers[high] < target) {
            ++low
        } else {
            --high
        }
    }
    return intArrayOf(low + 1, high + 1)
}
