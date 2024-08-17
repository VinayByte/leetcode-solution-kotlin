//https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/description/
class Solution {
    fun minFlips(a: Int, b: Int, c: Int): Int {
        var minFlip = 0
        for(i in 0 until 30){
            //a = 2->0010, b = 6->0110, target c = 5->0101
            //a OR b -> 0110 but target c -> 0101
            val bitAShift = a shr i
            val bitBShift = b shr i
            val bitCShift = c shr i

            val bitA = bitAShift and  1
            val bitB = bitBShift and  1
            val bitC = bitCShift and  1

            if(bitC == 0){
                minFlip += bitA + bitB
            } else {
                minFlip += if(bitA == 0 && bitB == 0) 1 else 0
            }
        }
        return minFlip
    }
}
