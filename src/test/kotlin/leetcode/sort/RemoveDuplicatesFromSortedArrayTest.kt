package leetcode.sort

import leetcode.sort.RemoveDuplicatesFromSortedArray
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

class RemoveDuplicatesFromSortedArrayTest {

    private val removeDuplicatesFromSortedArray = RemoveDuplicatesFromSortedArray();

    @Test
    @DisplayName("첫 번째 Case")
    fun removeDuplicates() {
        val nums: IntArray = intArrayOf(1, 1, 2)
        val removeDuplicates = removeDuplicatesFromSortedArray.removeDuplicates(nums)
        assertEquals(2, removeDuplicates)
    }

    @Test
    @DisplayName("두 번째 Case")
    fun removeDuplicates2() {
        val nums: IntArray = intArrayOf(0,0,1,1,1,2,2,3,3,4)
        val removeDuplicates = removeDuplicatesFromSortedArray.removeDuplicates(nums)
        assertEquals(5, removeDuplicates)
    }
}