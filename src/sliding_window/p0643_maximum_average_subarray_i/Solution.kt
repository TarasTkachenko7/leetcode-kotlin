package sliding_window.p0643_maximum_average_subarray_i

class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var currentSum: Double = 0.0

        for (i in 0..<k) {
            currentSum += nums[i]
        }

        var maxSum = currentSum

        for (i in k..nums.lastIndex) {
            currentSum += nums[i] - nums[i - k]
            maxSum = maxOf(maxSum, currentSum)
        }

        return maxSum / k
    }
}