/**
 * Created by VINAY on 11-08-2024.
 * Github:@vinayByte
 *
 * time complexity of the reverseBits function is O(1)
 */
class Solution {
    // you need treat n as an unsigned value
    fun reverseBits(n: Int): Int {
        //n = 1101
        var result = 0
        var input = n

        //i == 0
        for (i in 0 until 32) {
            val bit = input and 1 //1101 AND 0001 -> 0001
            val reverseBit = bit shl (31 - i) //1 shl (31-0) -> 10000000000000000000000000000000
            result =
                result or reverseBit // 00000000000000000000000000000000 OR 10000000000000000000000000000000 -> 10000000000000000000000000000000
            input = input shr 1 // 1101 shr 1 -> 0110 // index 1- > 0011, 2 -> 0001, 3 -> 0000
        }
        return result
    }
}
