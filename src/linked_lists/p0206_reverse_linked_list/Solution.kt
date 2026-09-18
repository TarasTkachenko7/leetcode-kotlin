package linked_lists.p0206_reverse_linked_list

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var current = head

        while (current != null) {
            val tmp = current.next
            current.next = prev
            prev = current
            current = tmp
        }

        return prev
    }
}