class Solution {
    fun longestStrChain(words: Array<String>): Int {
       val wordSet = words.toSet()
       val memo = mutableMapOf<String, Int>() 
       var maxChain = 0
       for (word in words) {
        maxChain = maxOf(maxChain, dfs(word, wordSet, memo))
       }
       return maxChain
    }

    fun dfs(word: String, wordSet: Set<String>, memo: MutableMap<String, Int>): Int {
        if (word in memo) {
            return memo[word]!!
        }
        var longestChain = 1
        for (i in word.indices) {
            val predecessor = word.substring(0, i) + word.substring(i + 1)
            if (predecessor in wordSet) {
                longestChain = maxOf(longestChain, dfs(predecessor, wordSet, memo) + 1)
            }
        }
        memo[word] = longestChain
        return longestChain
    }
}
