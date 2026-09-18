package linked_lists.p0083_remove_duplicates_from_sorted_list

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var current = head

        while (current != null) {
            if (current.next?.`val` == current.`val`) {
                current.next = current.next?.next
            } else {
                current = current.next
            }
        }

        return head
    }
}