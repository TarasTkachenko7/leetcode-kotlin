package arrays.p0303_range_sum_query_immutable

class NumArray(nums: IntArray) {
    private val prefixSums = IntArray(nums.size)

    init {
        var runningSum = 0
        for (i in nums.indices) {
            runningSum += nums[i]
            prefixSums[i] = runningSum
        }
    }

    fun sumRange(left: Int, right: Int): Int {
        val sumBeforeLeft = if (left == 0) 0 else prefixSums[left - 1]
        return prefixSums[right] - sumBeforeLeft
    }
}
