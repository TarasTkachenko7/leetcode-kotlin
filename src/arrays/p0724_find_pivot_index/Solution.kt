package arrays.p0724_find_pivot_index

class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var totalSum = 0

        nums.forEach {
            totalSum += it
        }

        var currentSum = 0
        for (i in nums.indices) {
            currentSum += nums[i]

            if (totalSum - currentSum == currentSum - nums[i]) return i
        }

        return -1
    }
}
