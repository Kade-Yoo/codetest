package leetcode.stack

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName

class ValidParenthesesTest {

    val validParentheses = ValidParentheses()

    @Test
    @DisplayName("첫 번째 케이스")
    fun testFirstCase() {
        val result = validParentheses.isValid("()")
        assertEquals(true, result)
    }

    @Test
    @DisplayName("두 번째 케이스")
    fun testSecondCase() {
        val result = validParentheses.isValid("()[]{}")
        assertEquals(true, result)
    }

    @Test
    @DisplayName("세 번째 케이스")
    fun testThirdCase() {
        val result = validParentheses.isValid("(]")
        assertEquals(false, result)
    }
}