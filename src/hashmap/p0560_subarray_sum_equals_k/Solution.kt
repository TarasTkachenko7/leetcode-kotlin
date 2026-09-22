package hashmap.p0560_subarray_sum_equals_k

class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var count = 0
        var currentSum = 0

        val prefixMap = HashMap<Int, Int>()
        prefixMap[0] = 1

        for (num in nums) {
            currentSum += num

            val target = currentSum - k

            if (prefixMap.containsKey(target)) {
                count += prefixMap[target]!!
            }

            prefixMap[currentSum] = (prefixMap[currentSum] ?: 0) + 1
        }

        return count
    }
}