package hashmap.p0525_contiguous_array

class Solution {
    fun findMaxLength(nums: IntArray): Int {
        var maxLength = 0
        var currentSum = 0

        val map = HashMap<Int, Int>()
        map[0] = -1

        for (i in nums.indices) {
            currentSum += if (nums[i] == 0) -1 else 1
            if (!map.containsKey(currentSum)) {
                map[currentSum] = i
            } else {
                maxLength = maxOf(i - map[currentSum]!!, maxLength)
            }
        }

        return maxLength
    }
}