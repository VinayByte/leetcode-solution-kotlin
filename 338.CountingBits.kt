//https://leetcode.com/problems/counting-bits/description
fun countBits(n: Int): IntArray {
        val result = IntArray(n + 1) // n=2: [0, 0, 0]
        for(i in 1..n){
            result[i] = result[i shr 1] + (i and 1) // i=1: [0, 1, 0], i=2:[0, 1, 1]
        }
        return result
}
