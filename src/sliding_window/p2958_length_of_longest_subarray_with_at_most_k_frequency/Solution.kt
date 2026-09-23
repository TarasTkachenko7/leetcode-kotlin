package sliding_window.p2958_length_of_longest_subarray_with_at_most_k_frequency

class Solution {
    fun maxSubarrayLength(nums: IntArray, k: Int): Int {
        val map = HashMap<Int, Int>()

        var left = 0
        var maxLength = 0

        for (right in nums.indices) {
            map[nums[right]] = (map[nums[right]] ?: 0) + 1

            while (map[nums[right]]!! > k) {
                map[nums[left]] = map[nums[left]]!! - 1
                left++
            }

            maxLength = maxOf(maxLength, right - left + 1)
        }

        return maxLength
    }
}