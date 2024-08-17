//https://leetcode.com/problems/equal-row-and-column-pairs/description/
fun equalPairs(grid: Array<IntArray>): Int {
    val rowMap = HashMap<String, Int>()
    val columnMap = HashMap<String, Int>()

    for (row in grid) {
        val key = row.joinToString(",")
        rowMap[key] = rowMap.getOrDefault(key, 0) + 1
    }
    for (j in 0 until grid[0].size) {
        val colString = StringBuilder()
        for (i in 0 until grid.size) {
            colString.append(grid[i][j]).append(",")
        }
        val key = colString.toString().dropLast(1)
        columnMap[key] = columnMap.getOrDefault(key, 0) + 1
    }

    var count = 0
    for ((rowKey, rowCount) in rowMap) {
        count += rowCount * (columnMap[rowKey] ?: 0)
    }
    return count

}
