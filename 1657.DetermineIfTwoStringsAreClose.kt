//https://leetcode.com/problems/determine-if-two-strings-are-close/description
fun closeStrings(word1: String, word2: String): Boolean {
    if (word1.length != word2.length) return false

    val map1 = HashMap<Char, Int>()
    val map2 = HashMap<Char, Int>()

    for (char in word1) {
        map1[char] = map1.getOrDefault(char, 0) + 1
    }
    for (char in word2) {
        map2[char] = map2.getOrDefault(char, 0) + 1
    }

    if (map1.keys != map2.keys) return false

    val values1 = map1.values.sorted()
    val values2 = map2.values.sorted()

    return values1 == values2

}
