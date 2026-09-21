package hashmap.p0049_group_anagrams

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, MutableList<String>>()

        for (str in strs) {
            val key = buildKey(str)
            map.getOrPut(key) { mutableListOf() }.add(str)
        }

        return map.values.toList()
    }

    private fun buildKey(word: String): String {
        val counts = IntArray(26)

        for (char in word) {
            counts[char - 'a']++
        }

        val sb = StringBuilder()
        for (count in counts) {
            sb.append('#')
            sb.append(count)
        }

        return sb.toString()
    }
}