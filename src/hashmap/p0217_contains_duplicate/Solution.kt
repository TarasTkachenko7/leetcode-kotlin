package hashmap.p0217_contains_duplicate

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val seen = HashSet<Int>()

        for (num in nums) {
            if (num !in seen) {
                seen.add(num)
            } else {
                return true
            }
        }

        return false
    }
}