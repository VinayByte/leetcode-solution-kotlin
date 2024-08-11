//O(log n)
fun hammingWeight(n: Int): Int {
    // Input: 11 (Binary: 1011)
    var count = 0
    var number = n

    while (number > 0) {
        // First iteration
        // Get the least significant bit
        val lsb = number and 1 //1011 AND 0001 -> 0001 (which is 1 in decimal)
        count += lsb // count = 0 + 1 = 1
        // Right shift the number by 1 bit
        number = number shr 1 //1011 >> 1 = 0101 (which is 5 in decimal)
    }

    return count
}
