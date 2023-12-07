package leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName

class GasStationTest {

    val gasStation = GasStation()

    @Test
    @DisplayName("첫 번쨰 케이스 : 성공 O")
    fun testCase1() {
        val gas = intArrayOf(1, 2, 3, 4, 5)
        val cost = intArrayOf(3,4,5,1,2)

        val canCompleteCircuit = gasStation.canCompleteCircuit(gas, cost)
        assertEquals(3 , canCompleteCircuit)
    }

    @Test
    @DisplayName("두 번쨰 케이스 : 성공 O")
    fun testCase2() {
        val gas = intArrayOf(2,3,4)
        val cost = intArrayOf(3,4,3)

        val canCompleteCircuit = gasStation.canCompleteCircuit(gas, cost)
        assertEquals(-1, canCompleteCircuit)
    }
}