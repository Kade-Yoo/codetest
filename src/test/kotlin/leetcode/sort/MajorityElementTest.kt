package leetcode.sort

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MajorityElementTest {

    private val majorityElement = MajorityElement()

    @Test
    @DisplayName("첫 번째 케이스")
    fun testCase1() {
        val result = majorityElement.majorityElement(intArrayOf(3, 2, 3))
        assertEquals(3, result)
    }

    @Test
    @DisplayName("두 번째 케이스")
    fun testCase2() {
        val result = majorityElement.majorityElement(intArrayOf(2,2,1,1,1,2,2))
        assertEquals(2, result)
    }
}