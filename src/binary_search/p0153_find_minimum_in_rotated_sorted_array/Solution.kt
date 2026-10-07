package binary_search.p0153_find_minimum_in_rotated_sorted_array

class Solution {
    fun findMin(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex

        while (left < right) {
            val mid = left + (right - left) / 2

            if (nums[mid] > nums[right]) {
                left = mid + 1
            } else {
                right = mid
            }
        }

        return nums[left]
    }
}