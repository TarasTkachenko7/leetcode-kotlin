package hashmap.p0205_isomorphic_strings

class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val sToT = HashMap<Char, Char>()
        val tToS = HashMap<Char, Char>()

        if (s.length != t.length) return false

        for (i in s.indices) {
            val from = s[i]
            val to = t[i]

            if (sToT[from] != null && sToT[from] != to) return false
            if (tToS[to] != null && tToS[to] != from) return false

            sToT[from] = to
            tToS[to] = from
        }

        return true
    }
}
