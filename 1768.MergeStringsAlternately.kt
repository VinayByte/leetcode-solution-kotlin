//https://leetcode.com/problems/merge-strings-alternately/description
fun mergeAlternately(word1: String, word2: String): String {
    val maxLength = maxOf(word1.length, word2.length)
    val sb = StringBuilder()
    for (i in 0 until maxLength) {
        if (i < word1.length) sb.append(word1[i])
        if (i < word2.length) sb.append(word2[i])
    }
    return sb.toString()
}
