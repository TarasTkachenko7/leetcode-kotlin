package linked_lists.p0142_linked_list_cycle_ii

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun detectCycle(head: ListNode?): ListNode? {
        var slow = head
        var fast = head

        while (fast != null && fast.next != null) {
            slow = slow?.next
            fast = fast.next?.next

            if (slow === fast) {
                var first = head
                while (first !== slow) {
                    first = first?.next
                    slow = slow?.next
                }
                return first
            }
        }

        return null
    }
}