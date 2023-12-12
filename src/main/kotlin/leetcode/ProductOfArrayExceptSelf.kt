package leetcode

class ProductOfArrayExceptSelf {

    /**
     * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
     *
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     *
     * You must write an algorithm that runs in O(n) time and without using the division operation.
     *
     * 자기 자신 index를 제외한 값을 모두 곱한 값
     */
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        result[0] = 1
        for (index in 1 until nums.size) {
            result[index] = result[index - 1] * nums[index - 1]
        }

        var multiple = 1
        for (index in nums.size - 2 downTo 0) {
            result[index] *= (nums[index + 1] * multiple)
            multiple *= nums[index + 1]
        }

        return result
    }
}