package leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ProductOfArrayExceptSelfTest {

    private val productOfArrayExceptSelf = ProductOfArrayExceptSelf()

    @Test
    fun firstTestCase() {
        val productExceptSelf = productOfArrayExceptSelf.productExceptSelf(intArrayOf(1,2,3,4))
        assertArrayEquals(intArrayOf(24,12,8,6), productExceptSelf)
    }

    @Test
    fun secondTestCase() {
        val productExceptSelf = productOfArrayExceptSelf.productExceptSelf(intArrayOf(-1,1,0,-3,3))
        assertArrayEquals(intArrayOf(0,0,9,0,0), productExceptSelf)
    }
}