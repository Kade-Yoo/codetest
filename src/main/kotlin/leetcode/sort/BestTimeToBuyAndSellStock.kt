package leetcode.sort

class BestTimeToBuyAndSellStock {

    /**
     *
     */
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        for (firstIndex in prices.indices) {
            for (secondIndex in firstIndex + 1 until prices.size) {
                val difference = prices[secondIndex] - prices[firstIndex]
                if (difference > 0 && maxProfit < difference) {
                    maxProfit = difference
                }
            }
        }

        return maxProfit
    }
}