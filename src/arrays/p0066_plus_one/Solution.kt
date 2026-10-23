package arrays.p0066_plus_one

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.lastIndex downTo 0) {
            if (digits[i] < 9) {
                digits[i]++
                return digits
            }
            digits[i] = 0
        }

        val result = IntArray(digits.size + 1)
        result[0] = 1
        return result
    }
}
