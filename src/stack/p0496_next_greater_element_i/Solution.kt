package stack.p0496_next_greater_element_i

class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val answer = IntArray(nums1.size)
        val stack = ArrayDeque<Int>()
        val map = HashMap<Int, Int>()

        for (num in nums2) {
            while (stack.isNotEmpty() && num > stack.last()) {
                val smallerNum = stack.removeLast()
                map[smallerNum] = num
            }
            stack.addLast(num)
        }

        for (i in nums1.indices) {
            val currentNum = nums1[i]
            answer[i] = map.getOrDefault(currentNum, -1)
        }

        return answer
    }
}