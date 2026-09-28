package stack.p2390_removing_stars_from_a_string

class Solution {
    fun removeStars(s: String): String {
        val stack = ArrayDeque<Char>()

        for (i in s) {
            if (i == '*') {
                stack.removeLast()
            } else {
                stack.addLast(i)
            }
        }

        return stack.joinToString("")
    }
}