/*
https://leetcode.com/problems/valid-anagram/description/
*/
fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }
    val map = mutableMapOf<Char, Int>()
    for (char in s) {
        map[char] = map.getOrDefault(char, 0) + 1
    }

    for (char in t) {
        val count = map[char] ?: return false
        if (count == 0) {
            return false
        }
        map[char] = count - 1
    }
    return map.values.all { it == 0 }
}
