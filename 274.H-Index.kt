//time complexity:O(n), space: O(n)
fun hIndex(citations: IntArray): Int {
    val n = citations.size
    val array = IntArray(n + 1)
    //maintaining count Counting citations
    for (c in citations) {
        if (c > n) {
            array[n]++ // If citation count exceeds n, increase last
        } else {
            array[c]++ //count it in its respective index
        }
    }
    var count = 0
    //Finding the h-index
    for (i in n downTo 0) {
        count = count + array[i]
        if (count >= i) {
            return i
        }
    }
    return 0

}
