//time complexity:O(n), space: O(1)
fun romanToInt(s: String): Int {
    val map = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    var res = 0
    var i = 0
    while (i < s.length) {
        if (i == s.length - 1) {
            res += map[s[i]]!!
            break
        }
        if (map[s[i]]!! < map[s[i + 1]]!!) {
            res += map[s[i + 1]]!! - map[s[i]]!!
            i += 2
        } else {
            res += map[s[i]]!!
            i++
        }
    }
    return res
}
