package sliding_window.p0567_permutation_in_string

class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false

        val s1Count = IntArray(26)
        val s2Count = IntArray(26)

        for (i in s1.indices) {
            s1Count[s1[i] - 'a']++
            s2Count[s2[i] - 'a']++
        }

        var matches = 0
        for (i in 0 until 26) {
            if (s1Count[i] == s2Count[i]) {
                matches++
            }
        }

        if (matches == 26) return true

        val windowSize = s1.length

        for (i in windowSize until s2.length) {
            val rightChar = s2[i] - 'a'
            val leftChar = s2[i - windowSize] - 'a'

            s2Count[rightChar]++
            if (s2Count[rightChar] == s1Count[rightChar]) {
                matches++
            } else if (s2Count[rightChar] == s1Count[rightChar] + 1) {
                matches--
            }

            s2Count[leftChar]--
            if (s2Count[leftChar] == s1Count[leftChar]) {
                matches++
            } else if (s2Count[leftChar] == s1Count[leftChar] - 1) {
                matches--
            }

            if (matches == 26) {
                return true
            }
        }

        return false
    }
}