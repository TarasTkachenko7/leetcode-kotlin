package binary_search.p1011_capacity_to_ship_packages_within_d_days

class Solution {
    fun shipWithinDays(weights: IntArray, days: Int): Int {
        var left = weights.max()
        var right = weights.sum()

        while (left < right) {
            val mid = left + (right - left) / 2

            var currentWeight = 0
            var shipsNeeded = 1

            for (weight in weights) {
                if (currentWeight + weight > mid) {
                    shipsNeeded++
                    currentWeight = 0
                }
                currentWeight += weight
            }

            if (shipsNeeded > days) {
                left = mid + 1
            } else {
                right = mid
            }
        }

        return left
    }
}