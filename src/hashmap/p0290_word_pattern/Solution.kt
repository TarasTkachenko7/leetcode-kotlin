package hashmap.p0290_word_pattern

class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val map = mutableMapOf<Char, String>()
        val sArr = s.split(" ")

        if (sArr.size != pattern.length) return false

        for (i in 0 until sArr.size) {
            val p = pattern[i]
            val word = sArr[i]
            val value = map[p]
            if (value == null && !map.containsValue(word)) map[p] = word
            else if (word != value) return false
        }

        return true
    }
}
