/*
https://leetcode.com/problems/isomorphic-strings/description
*/
fun isIsomorphic(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val map = mutableMapOf<Char, Char>()
    for (i in s.indices) {
        val key = s[i]
        val value = t[i]

        if (!map.containsKey(key)) {
            if (!map.containsValue(value)) {
                map[key] = value
            } else {
                return false
            }
        } else {
            val mappedValue = map[key]
            if (mappedValue != value) {
                return false
            }
        }
    }
    return true
}
