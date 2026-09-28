package stack.p0071_simplify_path

class Solution {
    fun simplifyPath(path: String): String {
        val stack = ArrayDeque<String>()

        for (part in path.split("/")) {
            if (part.isEmpty() || part == ".") {
                continue
            }

            if (part == "..") {
                if (stack.isNotEmpty()) {
                    stack.removeLast()
                }
            } else {
                stack.addLast(part)
            }
        }

        return "/" + stack.joinToString("/")
    }
}