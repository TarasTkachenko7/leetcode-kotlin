package stack.p0020_valid_parentheses

class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        val map = mapOf(
            '(' to ')',
            '[' to ']',
            '{' to '}'
        )

        for (i in s) {
            if (i in map) {
                stack.addLast(i)
            } else {
                if (stack.isEmpty()) return false
                val prev = stack.removeLast()
                if (i != map[prev]) return false
            }
        }

        return stack.isEmpty()
    }
}