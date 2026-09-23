package sliding_window.p2461_maximum_sum_of_distinct_subarrays_with_length_k

class Solution {
    fun maximumSubarraySum(nums: IntArray, k: Int): Long {
        var maxSum = 0L
        var currentSum = 0L

        var left = 0

        val set = HashSet<Int>()

        for (right in nums.indices) {
            val num = nums[right]

            while (set.contains(num)) {
                val leftNum = nums[left]
                set.remove(leftNum)
                currentSum -= leftNum
                left++
            }

            currentSum += num
            set.add(num)

            if (set.size == k) {
                maxSum = maxOf(maxSum, currentSum)
                set.remove(nums[left])
                currentSum -= nums[left]
                left++
            }
        }

        return maxSum
    }
}