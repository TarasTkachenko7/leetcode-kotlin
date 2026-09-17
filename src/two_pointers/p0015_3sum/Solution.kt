package two_pointers.p0015_3sum

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result = mutableListOf<List<Int>>()
        val n = nums.size

        for (i in 0..<n) {
            if (nums[i] > 0) break
            if (i > 0 && nums[i] == nums[i - 1]) continue

            val target = -nums[i]
            var left = i + 1
            var right = n - 1

            while (left < right) {
                val currentSum = nums[left] + nums[right]
                when {
                    currentSum == target -> {
                        result.add(listOf(nums[i], nums[left], nums[right]))

                        while (left < right && nums[left] == nums[left + 1]) left++
                        while (left < right && nums[right] == nums[right - 1]) right--

                        left++
                        right--
                    }
                    currentSum > target -> right--
                    else -> left++
                }
            }
        }

        return result
    }
}