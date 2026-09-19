package linked_lists.p0160_intersection_of_two_linked_lists

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        if (headA == null || headB == null) return null

        var pA = headA
        var pB = headB

        while (pA !== pB) {
            pA = if (pA == null) headB else pA.next
            pB = if (pB == null) headA else pB.next
        }

        return pA
    }
}