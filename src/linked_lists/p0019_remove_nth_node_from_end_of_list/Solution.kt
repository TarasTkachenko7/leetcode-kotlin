package linked_lists.p0019_remove_nth_node_from_end_of_list

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val dummy = ListNode(0)
        dummy.next = head

        var slow: ListNode? = dummy
        var fast: ListNode? = dummy

        repeat(n + 1) {
            fast = fast?.next
        }

        while (fast != null) {
            fast = fast?.next
            slow = slow?.next
        }

        slow?.next = slow.next?.next

        return dummy.next
    }
}