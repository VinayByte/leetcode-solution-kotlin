//https://leetcode.com/problems/ransom-note/description/
fun canConstruct(ransomNote: String, magazine: String): Boolean {
    //Input: ransomNote = "aa", magazine = "aab"
    val map = mutableMapOf<Char, Int>()
    //loop magazine and add char as key and count as value: {'a' -> 2, 'b' -> 1}
    for (key in magazine) {
        map[key] = map.getOrDefault(key, 0) + 1
    }

    //loop ransomNote and check value if found substract to 1 value
    //Check 'a': Available (2), Now (1)
    //Check 'a': Available (1), Now (0)
    for (key in ransomNote) {
        val count = map.getOrDefault(key, 0)
        if (count == 0) {
            return false
        }
        map[key] = count - 1
    }
    return true
}
