package two_pointers.p0844_backspace_string_compare

class Solution {
    fun backspaceCompare(s: String, t: String): Boolean {
        var sIndex = s.lastIndex
        var tIndex = t.lastIndex

        var skipS = 0
        var skipT = 0

        while (sIndex >= 0 || tIndex >= 0) {
            while (sIndex >= 0) {
                if (s[sIndex] == '#') {
                    skipS++
                    sIndex--
                } else if (skipS > 0) {
                    sIndex--
                    skipS--
                } else {
                    break
                }
            }

            while (tIndex >= 0) {
                if (t[tIndex] == '#') {
                    skipT++
                    tIndex--
                } else if (skipT > 0) {
                    tIndex--
                    skipT--
                } else {
                    break
                }
            }

            if (sIndex >= 0 && tIndex >= 0) {
                if (s[sIndex] != t[tIndex]) {
                    return false
                }
            } else if (sIndex >= 0 || tIndex >= 0) {
                return false
            }

            sIndex--
            tIndex--
        }

        return true
    }
}