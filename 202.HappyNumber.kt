/*
https://leetcode.com/problems/happy-number/description/
*/
//time: 0(log n) space:0(log n)
fun isHappy(n: Int): Boolean {
    val set = mutableSetOf<Int>()
    var squareSum = n
    //    if(squareSum == 1) return true
    while (squareSum != 1 && !set.contains(squareSum)) {
        set.add(squareSum)
        squareSum = happyNumber(squareSum)
    }
    return squareSum == 1
}

fun happyNumber(n: Int): Int {
    var squareSum = 0
    var num = n
    while (num > 0) {
        val rem = num % 10
        squareSum += rem * rem
        num = num / 10
    }
    return squareSum
}
