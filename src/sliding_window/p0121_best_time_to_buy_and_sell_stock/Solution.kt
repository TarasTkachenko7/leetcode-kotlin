package two_pointers.p0121_best_time_to_buy_and_sell_stock

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var bestProfit = 0
        var minPrice = Int.MAX_VALUE

        for (right in prices.indices) {
            if (prices[right] < minPrice) {
                minPrice = prices[right]
            }

            bestProfit = maxOf(prices[right] - minPrice, bestProfit)
        }

        return bestProfit
    }
}