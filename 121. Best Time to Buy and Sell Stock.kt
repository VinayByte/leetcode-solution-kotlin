//time complexity:O(n), space: O(1)
fun maxProfit(prices: IntArray): Int {
    var profit = 0
    var minPrice = prices[0]
    for (i in 1 until prices.size) {
        if (prices[i] > minPrice) {
            val diff = prices[i] - minPrice
            if (diff > profit) {
                profit = diff
            }
        } else {
            minPrice = prices[i]
        }
    }
    return profit
}
