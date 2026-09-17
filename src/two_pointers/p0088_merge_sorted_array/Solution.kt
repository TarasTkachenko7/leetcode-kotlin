package two_pointers.p0088_merge_sorted_array

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var mIndex = m - 1
        var nIndex = n - 1
        var index = nums1.lastIndex

        while (nIndex >= 0) {
            if (mIndex >= 0 && nums1[mIndex] > nums2[nIndex]) {
                nums1[index] = nums1[mIndex]
                mIndex--
            } else {
                nums1[index] = nums2[nIndex]
                nIndex--
            }
            index--
        }
    }
}