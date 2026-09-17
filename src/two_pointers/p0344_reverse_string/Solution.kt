package two_pointers.p0344_reverse_string

class Solution {
    fun reverseString(s: CharArray): Unit {
        var left = 0
        var right = s.lastIndex

        while (left < right) {
            val temp = s[left]
            s[left] = s[right]
            s[right] = temp

            left++
            right--
        }
    }
}