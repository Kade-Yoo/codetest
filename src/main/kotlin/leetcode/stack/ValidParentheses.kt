package leetcode.stack

import java.util.*

class ValidParentheses {

    /** Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
     * determine if the input string is valid.
     * An input string is valid if:
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     **/
    fun isValid(s: String): Boolean {
        val bracketStack = initStack(s)

        while (bracketStack.isNotEmpty()) {
            val firstValue = bracketStack.pop()
            val secondValue = bracketStack.pop()

            if (openBrackets[closeBrackets.indexOf(firstValue)] != secondValue) {
                return false
            }
        }

        return true
    }

    private fun initStack(s: String): Stack<Char> {
        val bracketStack: Stack<Char> = Stack()
        s.toCharArray().forEach { bracketStack.push(it) }
        return bracketStack
    }

    companion object {
        val openBrackets = arrayListOf('(', '{', '[')
        val closeBrackets = arrayListOf(')', '}', ']')
    }
}