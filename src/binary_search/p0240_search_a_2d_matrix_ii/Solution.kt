package binary_search.p0240_search_a_2d_matrix_ii

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var row = 0
        var col = matrix[0].lastIndex

        while (row < matrix.size && col >= 0) {
            val current = matrix[row][col]

            if (target == current) {
                return true
            } else if (target < current) {
                col--
            } else {
                row++
            }
        }

        return false
    }
}