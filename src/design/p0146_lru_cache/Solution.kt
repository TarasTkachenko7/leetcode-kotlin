package design.p0146_lru_cache

class DoublyLinkedList {
    class Node(
        val key: Int = 0,
        var value: Int = 0,
        var prev: Node? = null,
        var next: Node? = null
    )

    private val head = Node()
    private val tail = Node()

    init {
        head.next = tail
        tail.prev = head
    }

    fun add(node: Node) {
        val prevNode = tail.prev

        node.prev = prevNode
        node.next = tail

        prevNode?.next = node
        tail.prev = node
    }

    fun remove(node: Node) {
        node.prev?.next = node.next
        node.next?.prev = node.prev
    }

    fun moveToTail(node: Node) {
        remove(node)
        add(node)
    }

    fun removeLRU(): Node? {
        if (head.next == tail) return null

        val lruNode = head.next!!
        remove(lruNode)
        return lruNode
    }
}

class LRUCache(private val capacity: Int) {

    private val map = HashMap<Int, DoublyLinkedList.Node>()
    private val list = DoublyLinkedList()

    fun get(key: Int): Int {
        val node = map[key] ?: return -1

        list.moveToTail(node)

        return node.value
    }

    fun put(key: Int, value: Int) {
        val existingNode = map[key]
        if (existingNode != null) {
            existingNode.value = value
            list.moveToTail(existingNode)
        } else {
            if (map.size == capacity) {
                val evicted = list.removeLRU()
                if (evicted != null) {
                    map.remove(evicted.key)
                }
            }
            val node = DoublyLinkedList.Node(key, value)
            list.add(node)
            map[key] = node
        }
    }
}