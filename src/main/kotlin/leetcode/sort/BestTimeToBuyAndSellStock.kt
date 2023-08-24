package leetcode.sort

class BestTimeToBuyAndSellStock {

    /**
     *
     */
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        for (firstIndex in prices.indices) {
            for (secondIndex in firstIndex + 1 until prices.size) {
                if (prices[secondIndex] > prices[firstIndex] && maxProfit < (prices[secondIndex] - prices[firstIndex])) {
                    maxProfit = (prices[secondIndex] - prices[firstIndex])
                }
            }
        }

        return maxProfit
    }
}