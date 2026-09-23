package sliding_window.p0209_minimum_size_subarray_sum

class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var minLength = Int.MAX_VALUE
        var currentSum = 0
        var left = 0

        for (right in nums.indices) {
            currentSum += nums[right]

            while (currentSum >= target) {
                minLength = minOf(minLength, right - left + 1)
                currentSum -= nums[left]
                left++
            }
        }

        return if (minLength == Int.MAX_VALUE) 0 else minLength
    }
}