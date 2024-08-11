//time complexity:O(n*32) = 0(n), space: O(1)
fun singleNumber(nums: IntArray): Int {
    var result = 0
    for (i in 0 until 32) {
        var count = 0
        for (num in nums) {
            val rightShiftValue = num shr i
            val lsb = rightShiftValue and 1 //least significant bit
            count += lsb
        }
        count %= 3
        val bitValue = count shl i
        result = result or bitValue
    }
    return result
}
