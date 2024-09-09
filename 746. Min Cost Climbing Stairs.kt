class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val n = cost.size
        if(n==0) return 0
        if(n == 1) return cost[0]
        
        val minCost = IntArray(n+1)
        minCost[0] = cost[0]
        minCost[1] = cost[1]

        for(i in 2 until n){
            minCost[i] = cost[i] + minOf(minCost[i-1], minCost[i-2])
        }

        return minOf(minCost[n-1], minCost[n-2])
    }
}
