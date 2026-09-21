package hashmap.p0001_two_sum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        for (i in 0..nums.lastIndex) {
            val complement = target - nums[i]

            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }

            map[nums[i]] = i
        }

        return intArrayOf()
    }
}