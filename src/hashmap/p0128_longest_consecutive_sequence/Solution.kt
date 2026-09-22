package hashmap.p0128_longest_consecutive_sequence

class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        val set = nums.toHashSet()
        var longest = 0

        for (num in set) {
            if ((num - 1) !in set) {
                var currentNum = num
                var currentStreak = 1

                while ((currentNum + 1) in set) {
                    currentNum++
                    currentStreak++
                }

                longest = maxOf(longest, currentStreak)
            }
        }

        return longest
    }
}