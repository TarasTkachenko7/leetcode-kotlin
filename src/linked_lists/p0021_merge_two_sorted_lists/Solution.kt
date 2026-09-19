package linked_lists.p0021_merge_two_sorted_lists

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var first = list1
        var second = list2
        val dummy = ListNode(0)
        var current = dummy

        while (first != null && second != null) {
            if (first.`val` <= second.`val`) {
                current.next = first
                first = first.next
            } else {
                current.next = second
                second = second.next
            }
            current = current.next!!
        }

        current.next = first ?: second

        return dummy.next
    }
}