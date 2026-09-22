package hashmap.p0238_product_of_array_except_self

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size)

        var prefix = 1
        for (i in nums.indices) {
            result[i] = prefix
            prefix *= nums[i]
        }

        var postfix = 1
        for (i in nums.indices.reversed()) {
            result[i] *= postfix
            postfix *= nums[i]
        }

        return result
    }
}