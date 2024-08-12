/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description
*/
//time: 0(n) space:0(1)
fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    for (i in 0 until prices.size - 1) {
        val profit = prices[i + 1] - prices[i]
        if (profit > 0) {
            maxProfit += profit
        }
    }
    return maxProfit
}
