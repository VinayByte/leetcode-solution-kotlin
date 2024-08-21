class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var count = 0
        for (i in flowerbed.indices) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.lastIndex || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1
                count++
            }
        }
        return count >= n
    }
}
