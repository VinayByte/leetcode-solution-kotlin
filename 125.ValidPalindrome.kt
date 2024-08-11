//https://leetcode.com/problems/valid-palindrome/description
fun isPalindrome(s: String): Boolean {
    val str = s.lowercase()
    val filtered = str.filter { it.isLetterOrDigit() }

    return filtered == filtered.reversed()
}
