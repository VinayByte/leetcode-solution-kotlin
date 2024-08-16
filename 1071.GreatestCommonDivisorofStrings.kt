//https://leetcode.com/problems/greatest-common-divisor-of-strings/description
class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        if((str1.plus(str2)) != (str2.plus(str1))) return ""
        val length1 = str1.length
        val length2 = str2.length

        val length = gcd(length1, length2)
        return str1.substring(0, length)
    }

    fun gcd(length1: Int, length2: Int): Int{
        return if(length2 == 0) length1 else gcd(length2, length1 % length2)
    }
}
