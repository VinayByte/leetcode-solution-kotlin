//https://leetcode.com/problems/reverse-vowels-of-a-string/description/
fun reverseVowels(s: String): String {
    val charArray = s.toCharArray()
    var left = 0
    var right = s.length - 1
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    while (left < right) {
        if (charArray[left] !in vowels) {
            left++
        } else if (charArray[right] !in vowels) {
            right--
        } else {
            val temp = charArray[left]
            charArray[left] = charArray[right]
            charArray[right] = temp
            left++
            right--
        }
    }
    return String(charArray)
}
