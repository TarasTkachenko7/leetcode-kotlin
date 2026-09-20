package linked_lists.p0082_remove_duplicates_from_sorted_list_ii

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        val dummy = ListNode(0)
        dummy.next = head

        var left = dummy
        var right = head

        while (right != null) {
            if (right.next != null && right.`val` == right.next?.`val`) {
                while (right?.next != null && right.`val` == right.next?.`val`) {
                    right = right.next
                }
                left.next = right?.next
            } else {
                left = left.next!!
            }

            right = right?.next
        }

        return dummy.next
    }
}