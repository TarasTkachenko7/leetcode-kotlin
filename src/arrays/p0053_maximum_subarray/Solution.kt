package arrays.p0053_maximum_subarray

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var currentSum = nums[0]
        var maxSum = nums[0]

        for (index in 1..<nums.size) {
            val number = nums[index]
            currentSum = maxOf(number, currentSum + number)
            maxSum = maxOf(maxSum, currentSum)
        }

        return maxSum
    }
}
