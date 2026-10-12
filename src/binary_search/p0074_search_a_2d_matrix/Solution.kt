package binary_search.p0074_search_a_2d_matrix

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var leftMatrix = 0
        var rightMatrix = matrix.lastIndex

        while (leftMatrix <= rightMatrix) {
            val mid = leftMatrix + (rightMatrix - leftMatrix) / 2
            if (matrix[mid][0] <= target && matrix[mid][matrix[mid].lastIndex] >= target) {
                return search(matrix[mid], target)
            } else if (matrix[mid][0] > target) {
                rightMatrix = mid - 1
            } else {
                leftMatrix = mid + 1
            }
        }

        return false
    }

    private fun search(nums: IntArray, target: Int): Boolean {
        var left = 0
        var right = nums.lastIndex

        while (left <= right) {
            val mid = left + (right - left) / 2

            if (nums[mid] == target) {
                return true
            } else if (nums[mid] < target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return false
    }
}