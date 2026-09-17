package two_pointers.p0167_two_sum_ii_input_array_is_sorted

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.lastIndex

        while (left < right) {
            val sum = numbers[left] + numbers[right]
            when {
                sum == target -> return intArrayOf(left + 1, right + 1)
                sum < target -> left++
                else -> right--
            }
        }

        return intArrayOf()
    }
}