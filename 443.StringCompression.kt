class Solution {
    fun compress(chars: CharArray): Int {
        var index = 0
        var count = 1

        for (i in 1 until chars.size) {
            if (chars[i] == chars[i - 1]) {
                count++
            } else {
                chars[index++] = chars[i - 1]
                if (count > 1) {
                    for (c in count.toString()) {
                        chars[index++] = c
                    }
                }
                count = 1
            }
        }

        chars[index++] = chars[chars.size - 1]
        if (count > 1) {
            for (c in count.toString()) {
                chars[index++] = c
            }
        }

        return index
    }
}
