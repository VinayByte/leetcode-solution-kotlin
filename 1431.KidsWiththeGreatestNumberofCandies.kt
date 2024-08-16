//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val max = candies.maxOrNull() ?: 0
    val result = candies.map { candie ->
        candie + extraCandies >= max
    }
    return result
}

// Brute force
fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val result = mutableListOf<Boolean>()
    for (i in candies.indices) {
        val sum = candies[i] + extraCandies
        var isFound = true
        for (j in candies.indices) {
            if (j != i && sum < candies[j]) {
                isFound = false
                break
            }
        }
        result.add(isFound)
    }
    return result
}
