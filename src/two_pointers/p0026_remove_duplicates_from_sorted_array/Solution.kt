package two_pointers.p0026_remove_duplicates_from_sorted_array

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var insertIndex = 1
        for (i in 1 until nums.size) {
            if (nums[i] != nums[i - 1]) {
                nums[insertIndex] = nums[i]
                insertIndex++
            }
        }
        return insertIndex
    }
}