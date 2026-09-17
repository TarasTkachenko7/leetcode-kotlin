package two_pointers.p0283_move_zeroes

class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var insertIndex = 0

        for (i in nums.indices) {
            if (nums[i] != 0) {
                if (i != insertIndex) {
                    nums[insertIndex] = nums[i]
                    nums[i] = 0
                }
                insertIndex++
            }
        }
    }
}