package two_pointers.p0075_sort_colors

class Solution {
    fun sortColors(nums: IntArray): Unit {
        var low = 0
        var mid = 0
        var high = nums.lastIndex

        while (mid <= high) {
            when (nums[mid]) {
                0 -> {
                    nums.swap(low, mid)
                    low++
                    mid++
                }
                1 -> {
                    mid++
                }
                2 -> {
                    nums.swap(mid, high)
                    high--
                }
            }
        }
    }

    private fun IntArray.swap(i: Int, j: Int) {
        val tmp = this[i]
        this[i] = this[j]
        this[j] = tmp
    }
}