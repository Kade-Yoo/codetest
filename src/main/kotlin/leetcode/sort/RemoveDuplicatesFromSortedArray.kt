package leetcode.sort

class RemoveDuplicatesFromSortedArray {

    /**
     * 26. Remove Duplicates from Sorted Array
     *
     * 문제 내용
     * 1. 오름 차순 정렬된 배열을 중복 제거한다
     * 2. 중복 제거된 배열의 숫자 갯수를 반환한다
     *
     * int[] nums = [...]; // Input array
     * int[] expectedNums = [...]; // The expected answer with correct length
     *
     * int k = removeDuplicates(nums); // Calls your implementation
     *
     * assert k == expectedNums.length;
     * for (int i = 0; i < k; i++) {
     *     assert nums[i] == expectedNums[i];
     * }
     *
     * 풀이 방법
     * 1. 입력 받은 nums가 중복제거 되고
     * 2. 중복 제거 된 nums의 숫자 갯수를 반환하면 될 것이라고 생각하여 SortedSet(복잡도 : N)에 값을 넣어주었다.
     * 3. SortedSet에 넣어준 값을 다시 nums에 복사하여 nums가 변경 된 후에 k까지 어떤 값들이 출력되는지를 나타내게 되었다.
     */
    fun removeDuplicates(nums: IntArray): Int {
        val sortedSet = nums.toSortedSet()
        for (index in 1 until sortedSet.size) {
            nums[index] = sortedSet.elementAt(index)
        }

        return sortedSet.size
    }
}