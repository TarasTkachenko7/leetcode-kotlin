package binary_search.p0034_find_first_and_last_position_of_element_in_sorted_array

class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        val first = findBound(nums, target, true)
        if (first == -1) return intArrayOf(-1, -1)
        val second = findBound(nums, target, false)
        return intArrayOf(first, second)
    }

    private fun findBound(nums: IntArray, target: Int, isFirst: Boolean): Int {
        var left = 0
        var right = nums.lastIndex
        var bound = -1

        while (left <= right) {
            val mid = left + (right - left) / 2

            if (nums[mid] == target) {
                bound = mid
                if (isFirst) {
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            } else if (nums[mid] < target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return bound
    }
}