package linked_lists.p0706_design_hashmap

class MyHashMap() {

    private class Node(
        val key: Int,
        var value: Int,
        var next: Node? = null
    )

    private val capacity = 2069
    private val buckets = Array(capacity) { Node(-1, -1) }

    private fun getIndex(key: Int): Int {
        return key % capacity
    }

    private fun findPrev(head: Node, key: Int): Node {
        var curr = head
        while (curr.next != null && curr.next!!.key != key) {
            curr = curr.next!!
        }
        return curr
    }

    fun put(key: Int, value: Int) {
        val prev = findPrev(buckets[getIndex(key)], key)

        if (prev.next == null) {
            prev.next = Node(key, value)
        } else {
            prev.next!!.value = value
        }
    }

    fun get(key: Int): Int {
        val prev = findPrev(buckets[getIndex(key)], key)
        return prev.next?.value ?: -1
    }

    fun remove(key: Int) {
        val prev = findPrev(buckets[getIndex(key)], key)

        if (prev.next != null) {
            prev.next = prev.next!!.next
        }
    }
}