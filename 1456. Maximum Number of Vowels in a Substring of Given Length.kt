class Solution {
    fun maxVowels(s: String, k: Int): Int {
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        var maxCount = 0
        var windowVowels = 0
        
        for (i in s.indices) {
            if (i >= k) {
                if (s[i - k] in vowels) {
                    windowVowels--
                }
            }
            if (s[i] in vowels) {
                windowVowels++
            }
            maxCount = maxOf(maxCount, windowVowels)
        }
        return maxCount
    }
    fun maxVowels1(s: String, k: Int): Int {
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        val length = s.length
        if (k > length) return 0
        var maxCount = 0
        for(i in 0..(length-k)){
            val subString = s.substring(i, i+k)
            val vowelsCount = subString.count{it in vowels}
            maxCount = maxOf(maxCount, vowelsCount)
        }
        return maxCount
    }
}
