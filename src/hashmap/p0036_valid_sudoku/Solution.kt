package hashmap.p0036_valid_sudoku

class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = Array(9) { HashSet<Char>() }
        val columns = Array(9) { HashSet<Char>() }
        val boxes = Array(9) { HashSet<Char>() }

        for (i in board.indices) {
            for (j in board[i].indices) {
                val digit = board[i][j]
                if (digit == '.') continue

                val boxIndex = (i / 3) * 3 + j / 3

                if (!rows[i].add(digit) ||
                    !columns[j].add(digit) ||
                    !boxes[boxIndex].add(digit)
                ) {
                    return false
                }
            }
        }

        return true
    }
}
