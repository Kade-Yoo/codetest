package leetcode.sort

class BestTimeToBuyAndSellStock {

    /**
     * 앞에서 최솟값을 유지하고 index를 늘리면서 최대 이익이 되는 것을 찾으면 된다
     * 굳이 뒤에까지 계산할 필요가 없었다
     * important condition : you must buy before you sell
     *
     * 1 <= prices.length <= 10^5
     * 0 <= prices[i] <= 10^4
     */
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var minValue = Integer.MAX_VALUE

        for (firstIndex in prices.indices) {
            minValue = if (prices[firstIndex] < minValue) prices[firstIndex] else minValue
            maxProfit = if (prices[firstIndex] - minValue > 0 && prices[firstIndex] - minValue > maxProfit) prices[firstIndex] - minValue else maxProfit
        }

        return maxProfit
    }
}