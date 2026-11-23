package arrays.p0974_subarray_sums_divisible_by_k

class Solution {
    fun subarraysDivByK(nums: IntArray, k: Int): Int {
        var count = 0
        var currentSum = 0

        val remainderCounts = HashMap<Int, Int>()
        remainderCounts[0] = 1

        for (num in nums) {
            currentSum += num

            var remainder = currentSum % k
            if (remainder < 0) {
                remainder += k
            }

            val previousCount = remainderCounts[remainder] ?: 0
            count += previousCount
            remainderCounts[remainder] = previousCount + 1
        }

        return count
    }
}
