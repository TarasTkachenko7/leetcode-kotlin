package linked_lists.p0143_reorder_list

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun reorderList(head: ListNode?): Unit {
        if (head?.next == null) return

        var slow = head
        var fast = head

        while (fast?.next?.next != null) {
            fast = fast.next?.next
            slow = slow?.next
        }

        var curr = slow?.next
        slow?.next = null

        var prev: ListNode? = null
        while (curr != null) {
            val tmp = curr.next
            curr.next = prev
            prev = curr
            curr = tmp
        }

        var first = head
        var second = prev

        while (second != null) {
            val tmp1 = first?.next
            val tmp2 = second.next

            first?.next = second
            second.next = tmp1

            first = tmp1
            second = tmp2
        }
    }
}