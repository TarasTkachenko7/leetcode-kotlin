package linked_lists.p0023_merge_k_sorted_lists

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.isEmpty()) return null

        var currentLists = lists.toList()

        while (currentLists.size > 1) {
            val mergedLists = mutableListOf<ListNode?>()

            for (i in 0 until currentLists.size step 2) {
                val l1 = currentLists[i]
                val l2 = if (i + 1 < currentLists.size) currentLists[i + 1] else null

                mergedLists.add(mergeTwoLists(l1, l2))
            }

            currentLists = mergedLists
        }

        return currentLists[0]
    }

    private fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var first = list1
        var second = list2
        val dummy = ListNode(0)
        var current = dummy

        while (first != null && second != null) {
            if (first.`val` <= second.`val`) {
                current.next = first
                first = first.next
            } else {
                current.next = second
                second = second.next
            }
            current = current.next!!
        }

        current.next = first ?: second

        return dummy.next
    }
}