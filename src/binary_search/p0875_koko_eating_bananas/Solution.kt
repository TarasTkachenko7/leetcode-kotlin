package binary_search.p0875_koko_eating_bananas

class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var left = 1
        var right = piles.max()

        while (left < right) {
            val mid = left + (right - left) / 2

            var count = 0L
            for (pile in piles) {
                count += (pile + mid - 1L) / mid
            }

            if (count > h) {
                left = mid + 1
            } else {
                right = mid
            }
        }

        return left
    }
}