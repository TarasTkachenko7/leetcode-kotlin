package two_pointers.p0977_squares_of_a_sorted_array

class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var left = 0
        var right = nums.lastIndex
        var insertIndex = nums.lastIndex

        while (left <= right) {
            val leftSquare = nums[left] * nums[left]
            val rightSquare = nums[right] * nums[right]

            if (leftSquare > rightSquare) {
                result[insertIndex] = leftSquare
                left++
            } else {
                result[insertIndex] = rightSquare
                right--
            }
            insertIndex--
        }

        return result
    }
}