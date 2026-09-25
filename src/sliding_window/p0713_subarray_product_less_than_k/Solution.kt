package sliding_window.p0713_subarray_product_less_than_k

class Solution {
    fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
        if (k <= 1) return 0

        var result = 0
        var currentProduct = 1
        var left = 0

        for (right in nums.indices) {
            currentProduct *= nums[right]

            while (currentProduct >= k) {
                currentProduct /= nums[left]
                left++
            }

            result += (right - left + 1)
        }

        return result
    }
}