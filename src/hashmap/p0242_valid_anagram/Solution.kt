package hashmap.p0242_valid_anagram

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val alphabet = IntArray(26)

        for (i in s.indices) {
            val sChar = s[i]
            val tChar = t[i]
            alphabet[sChar - 'a']++
            alphabet[tChar - 'a']--
        }

        return alphabet.all { it == 0 }
    }
}