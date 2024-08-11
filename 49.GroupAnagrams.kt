/*
https://leetcode.com/problems/group-anagrams/description
*/
fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map: MutableMap<String, MutableList<String>> = HashMap()
    for (s in strs) {
        val charArray = s.toCharArray()
        charArray.sort()
        val key = String(charArray)
        if (!map.containsKey(key)) {
            map[key] = mutableListOf()
        }
        map[key]?.add(s)
    }
    return map.values.toList()
}
