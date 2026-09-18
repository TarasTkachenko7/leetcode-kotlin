package two_pointers.p0287_find_the_duplicate_number

class Solution {
    fun findDuplicate(nums: IntArray): Int {
        var slow = nums[0]
        var fast = nums[0]

        do {
            slow = nums[slow]
            fast = nums[nums[fast]]
        } while (slow != fast)

        var ptr1 = nums[0]
        var ptr2 = slow

        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1]
            ptr2 = nums[ptr2]
        }

        return ptr1
    }
}