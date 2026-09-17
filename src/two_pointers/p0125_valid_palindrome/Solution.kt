package two_pointers.p0125_valid_palindrome

class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.lastIndex

        while (left < right) {
            when {
                !s[left].isLetterOrDigit() -> left++
                !s[right].isLetterOrDigit() -> right--
                else -> {
                    if (s[left].lowercaseChar() != s[right].lowercaseChar()) {
                        return false
                    }
                    left++
                    right--
                }
            }
        }
        return true
    }
}