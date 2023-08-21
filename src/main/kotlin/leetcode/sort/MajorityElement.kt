package leetcode.sort

import java.lang.Exception

/**
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */
class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        // 숫자별 count 갯수 저장 : O(n)
        val numCountMap = getNumCountMap(nums)

        // n / 2 이상인 것 확인
        return calculateMajorityNum(numCountMap, nums.size)
    }

    /**
     * majority number 계산
     */
    private fun calculateMajorityNum(numCountMap: HashMap<Int, Int>, size: Int): Int {
        val halfOfSize = size / 2
        var result = 0

        numCountMap.entries.forEach {
            if (it.value > halfOfSize) result = it.key
            if (result > 0) return result
        }

        return result
    }

    /**
     * num별 count계산 map
     */
    private fun getNumCountMap(nums: IntArray): HashMap<Int, Int> {
        val numCountMap = HashMap<Int, Int>()
        val defaultNumber = 0

        nums.forEach {
            numCountMap[it] = numCountMap.getOrDefault(it, defaultNumber) + 1
        }

        return numCountMap
    }
}