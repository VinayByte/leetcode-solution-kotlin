class Solution {
    fun solveSudoku(board: Array<CharArray>) {
    val rows = Array(9) { BooleanArray(9) }
    val cols = Array(9) { BooleanArray(9) }
    val boxes = Array(3) { Array(3) { BooleanArray(9) } }

    for (i in 0..8) {
        for (j in 0..8) {
            if (board[i][j] != '.') {
                val num = board[i][j] - '1'
                rows[i][num] = true
                cols[j][num] = true
                boxes[i / 3][j / 3][num] = true
            }
        }
    }

    fun isSafe(row: Int, col: Int, num: Int): Boolean {
        return !rows[row][num] && !cols[col][num] && !boxes[row / 3][col / 3][num]
    }

    fun solve(): Boolean {
        for (i in 0..8) {
            for (j in 0..8) {
                if (board[i][j] == '.') {
                    for (num in 0..8) {
                        if (isSafe(i, j, num)) {
                            rows[i][num] = true
                            cols[j][num] = true
                            boxes[i / 3][j / 3][num] = true
                            board[i][j] = '1' + num
                            if (solve()) {
                                return true
                            }
                            rows[i][num] = false
                            cols[j][num] = false
                            boxes[i / 3][j / 3][num] = false
                            board[i][j] = '.'
                        }
                    }
                    return false
                }
            }
        }
        return true
    }

    solve()
    }
}
