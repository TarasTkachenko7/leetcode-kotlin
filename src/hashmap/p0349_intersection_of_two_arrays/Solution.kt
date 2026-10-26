package hashmap.p0349_intersection_of_two_arrays

class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val firstIsSmaller = nums1.size <= nums2.size

        val smaller = if (firstIsSmaller) nums1 else nums2
        val larger = if (firstIsSmaller) nums2 else nums1

        val remaining = HashSet<Int>()
        for (number in smaller) {
            remaining.add(number)
        }

        val result = mutableListOf<Int>()

        for (number in larger) {
            if (remaining.remove(number)) {
                result.add(number)
            }
        }

        return result.toIntArray()
    }
}
