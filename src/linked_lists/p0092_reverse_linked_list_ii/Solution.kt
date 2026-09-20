package linked_lists.p0092_reverse_linked_list_ii

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        if (head == null || left == right) return head

        val dummy = ListNode(0)
        dummy.next = head

        var nodeBeforeLeft: ListNode? = dummy
        for (i in 1 until left) {
            nodeBeforeLeft = nodeBeforeLeft?.next
        }

        var prev: ListNode? = null
        var curr = nodeBeforeLeft?.next
        val leftNode = curr

        for (i in 0..(right - left)) {
            val nextTemp = curr?.next
            curr?.next = prev
            prev = curr
            curr = nextTemp
        }

        leftNode?.next = curr
        nodeBeforeLeft?.next = prev

        return dummy.next
    }
}