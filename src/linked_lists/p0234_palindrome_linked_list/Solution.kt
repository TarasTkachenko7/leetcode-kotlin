package linked_lists.p0234_palindrome_linked_list

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        var slow = head
        var fast = head

        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        var prev: ListNode? = null
        var curr = slow

        while (curr != null) {
            val nextTemp = curr.next
            curr.next = prev
            prev = curr
            curr = nextTemp
        }

        var p1 = head
        var p2 = prev

        while (p2 != null) {
            if (p1?.`val` != p2.`val`) {
                return false
            }
            p1 = p1.next
            p2 = p2.next
        }

        return true
    }
}