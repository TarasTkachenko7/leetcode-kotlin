package hashmap.p0290_word_pattern

class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val patternToS = HashMap<Char, String>()
        val sToPattern = HashMap<String, Char>()

        val sWords = s.split(' ')

        if (pattern.length != sWords.size) return false

        for (i in pattern.indices) {
            val from = pattern[i]
            val to = sWords[i]

            if (patternToS[from] != null && patternToS[from] != to) return false
            if (sToPattern[to] != null && sToPattern[to] != from) return false

            patternToS[from] = to
            sToPattern[to] = from
        }

        return true
    }
}
