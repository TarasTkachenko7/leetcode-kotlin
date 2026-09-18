package linked_lists.p2095_delete_the_middle_node_of_a_linked_list

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun deleteMiddle(head: ListNode?): ListNode? {
        if (head?.next == null) return null

        var slow = head
        var fast = head.next?.next

        while (fast?.next != null) {
            fast = fast.next?.next
            slow = slow?.next
        }

        slow?.next = slow?.next?.next

        return head
    }
}