package binary_search.p0035_search_insert_position

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.lastIndex

        while (left <= right) {
            val mid = left + (right - left) / 2
            if (target == nums[mid]) return mid
            else if (target > nums[mid]) left = mid + 1
            else right = mid - 1
        }

        return left
    }
}