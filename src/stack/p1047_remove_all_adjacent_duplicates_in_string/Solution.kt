package stack.p1047_remove_all_adjacent_duplicates_in_string

class Solution {
    fun removeDuplicates(s: String): String {
        val stack = ArrayDeque<Char>()

        for (ch in s) {
            if (stack.isNotEmpty() && stack.last() == ch) {
                stack.removeLast()
            } else {
                stack.addLast(ch)
            }
        }

        return stack.joinToString("")
    }
}