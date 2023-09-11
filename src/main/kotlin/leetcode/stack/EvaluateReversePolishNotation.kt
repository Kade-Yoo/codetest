package leetcode.stack

import java.util.Stack

class EvaluateReversePolishNotation {
    /**
     * You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
     *
     * Evaluate the expression. Return an integer that represents the value of the expression
     *
     * 풀이 방법
     * 1. 입력 받은 토큰을 확인한다(반복)
     * 2. 토큰이 숫자라면(연산자가 아닐때) 스택에 쌓는다
     * 3. 토큰이 숫자이면서 연산 가능한 값 갯수가 넘은 스택이라면
     * 4. 2개 값을 pop한 후 계산한다
     * 5. 계산한 값을 stack에 넣고 3~5을 반복한다
     */
    fun evalRPN(tokens: Array<String>): Int {
        val numberStack: Stack<Int> = Stack()

        // token 반복문으로 돌면서
        for (token in tokens) {
            if (!operatorList.contains(token)) {
                // 숫자를 stack에 넣는다
                numberStack.push(token.toInt())
                continue
            }

            // stack에서 값을 꺼낸다
            if (numberStack.size >= CALCULATION_POINT_SIZE) {
                val (firstValue, secondValue) = pair(numberStack)

                // 계산 값을 스택에 넣는다
                numberStack.push(
                    calculateNumber(token, firstValue, secondValue)
                )
            }
        }

        return numberStack.peek()
    }

    private fun pair(numberStack: Stack<Int>): Pair<Int, Int> {
        // 두 개의 수가 꺼내졌다면
        val firstValue = numberStack.pop()
        val secondValue = numberStack.pop()
        return Pair(firstValue, secondValue)
    }

    private fun calculateNumber(token: String, firstValue: Int, secondValue: Int) = when (token) {
        // 연산하고
        "+" -> secondValue + firstValue
        "-" -> secondValue - firstValue
        "*" -> secondValue * firstValue
        "/" -> secondValue / firstValue
        else -> 0
    }

    companion object {
        const val CALCULATION_POINT_SIZE = 2
        val operatorList = arrayListOf("+", "-", "*", "/")
    }
}