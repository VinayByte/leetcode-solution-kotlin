/*
https://leetcode.com/problems/word-pattern/description
*/
fun wordPattern(pattern: String, s: String): Boolean {
    val map: MutableMap<String, Char> = HashMap()
    val patternArray = pattern.toCharArray()
    val sArray = s.split(" ")
    if (patternArray.size != sArray.size) {
        return false
    }

    for (i in sArray.indices) {
        val key = sArray[i]
        val value = patternArray[i]

        if (!map.containsKey(key) && !map.containsValue(value)) {
            map[key] = value
        } else if (!map.containsKey(key) && map.containsValue(value)) {
            return false
        } else {
            if (map[key] != value) {
                return false
            }
        }
    }

    return true
}
