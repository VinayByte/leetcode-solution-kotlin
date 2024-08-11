//https://leetcode.com/problems/is-subsequence/description
fun isSubsequence(s: String, t: String): Boolean {
    var i = 0
    for (char in t) {
        if (i < s.length && char == s[i]) {
            i++
        }
    }
    return i == s.length
}
