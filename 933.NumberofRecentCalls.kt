//https://leetcode.com/problems/number-of-recent-calls/description/
class RecentCounter() {
    private val queue = mutableListOf<Int>()

    fun ping(t: Int): Int {
        queue.add(t)
        while(queue.first() < t - 3000){
            queue.removeAt(0)
        }
        return queue.size
    }

}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * var obj = RecentCounter()
 * var param_1 = obj.ping(t)
 */
