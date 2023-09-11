package leetcode.stack

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName

class EvaluateReversePolishNotationTest {

    private lateinit var evaluateReversePolishNotation: EvaluateReversePolishNotation

    @BeforeEach
    fun init() {
        evaluateReversePolishNotation = EvaluateReversePolishNotation()
    }

    /**
     * Input: tokens = ["2","1","+","3","*"]
     * Output: 9
     * Explanation: ((2 + 1) * 3) = 9
     */
    @Test
    @DisplayName("첫 번째 케이스")
    fun testFirstCase() {
        val result = evaluateReversePolishNotation.evalRPN(arrayOf("2", "1", "+", "3", "*"))
        assertEquals(9, result)
    }


    /*
    Input: tokens = ["4","13","5","/","+"]
    Output: 6
    Explanation: (4 + (13 / 5)) = 6
    */
    @Test
    @DisplayName("두 번째 케이스")
    fun testSecondCase() {
        val result = evaluateReversePolishNotation.evalRPN(arrayOf("4","13","5","/","+"))
        assertEquals(6, result)
    }

    /*
    Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
    Output: 22
    Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
     */
    @Test
    @DisplayName("세 번째 케이스")
    fun testThirdCase() {
        val result = evaluateReversePolishNotation.evalRPN(arrayOf("10","6","9","3","+","-11","*","/","*","17","+","5","+"))
        assertEquals(22, result)
    }
}