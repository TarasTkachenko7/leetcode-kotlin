package linked_lists.p0024_swap_nodes_in_pairs

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun swapPairs(head: ListNode?): ListNode? {
        val dummy = ListNode(0)
        dummy.next = head

        var current = dummy
        while (current.next != null && current.next?.next != null) {
            val first = current.next!!
            val second = first.next!!

            first.next = second.next
            second.next = first
            current.next = second

            current = first
        }

        return dummy.next
    }
}