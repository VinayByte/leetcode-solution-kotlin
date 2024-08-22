class Solution {
    fun divide(dividend: Int, divisor: Int): Int {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE
        }
        var num = abs(dividend.toLong())
        var divisor_ = abs(divisor.toLong())
        var res = 0L
        while (num >= divisor_) {
            var multi = 1L
            var times = divisor_
            while (times < num) {
                times = times shl 1
                multi = multi shl 1
            }
            if (times > num) {
                multi = multi shr 1
                times = times shr 1
            }
            res += multi
            num -= times
        }
        if ((dividend > 0) xor (divisor > 0)) {
            res = -res
        }
        return res.toInt()
    }
}
