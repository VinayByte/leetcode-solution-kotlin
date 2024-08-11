class Solution {
    fun rangeBitwiseAnd(left: Int, right: Int): Int {
        var shiftCount = 0
        var leftValue = left
        var rightValue = right
        while(leftValue != rightValue){
            leftValue = leftValue shr 1
            rightValue = rightValue shr 1
            shiftCount++
        }
        return leftValue shl shiftCount
    }
}
