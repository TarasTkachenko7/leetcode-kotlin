package linked_list.p0707_design_linked_list

class MyLinkedList() {

    private class ListNode(
        var `val`: Int,
        var next: ListNode? = null
    )

    private var head: ListNode? = null
    private var size = 0

    fun get(index: Int): Int {
        if (index !in 0..<size) {
            return -1
        }

        var current = head
        repeat(index) {
            current = current?.next
        }

        return current?.`val` ?: -1
    }

    fun addAtHead(`val`: Int) {
        head = ListNode(`val`, head)
        size++
    }

    fun addAtTail(`val`: Int) {
        if (head == null) {
            addAtHead(`val`)
            return
        }

        var current = head
        repeat(size - 1) {
            current = current?.next
        }

        current?.next = ListNode(`val`, null)
        size++
    }

    fun addAtIndex(index: Int, `val`: Int) {
        if (index !in 0..size) return

        if (index == 0) {
            addAtHead(`val`)
            return
        }

        var current = head
        repeat(index - 1) {
            current = current?.next
        }

        current?.next = ListNode(`val`, current.next)
        size++
    }

    fun deleteAtIndex(index: Int) {
        if (index !in 0..<size) return

        if (index == 0) {
            head = head?.next
            size--
            return
        }

        var current = head
        repeat(index - 1) {
            current = current?.next
        }

        current?.next = current.next?.next
        size--
    }
}