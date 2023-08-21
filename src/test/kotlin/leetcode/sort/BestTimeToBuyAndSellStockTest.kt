package leetcode.sort

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class BestTimeToBuyAndSellStockTest {

    private val bestTimeToBuyAndSellStock = BestTimeToBuyAndSellStock()

    @Test
    @DisplayName("첫 번째 케이스")
    fun testCase1() {
        val maxProfit = bestTimeToBuyAndSellStock.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))
        assertEquals(5, maxProfit)
    }

    @Test
    @DisplayName("두 번째 케이스")
    fun testCase2() {
        val maxProfit = bestTimeToBuyAndSellStock.maxProfit(intArrayOf(7,6,4,3,1))
        assertEquals(0, maxProfit)
    }

    @Test
    @DisplayName("세 번째 케이스")
    fun testCase3() {
        val maxProfit = bestTimeToBuyAndSellStock.maxProfit(intArrayOf(1,2))
        assertEquals(1, maxProfit)
    }
}