package queue.p0933_number_of_recent_calls

class RecentCounter {

    private val queue = ArrayDeque<Int>()

    fun ping(t: Int): Int {
        queue.addLast(t)

        val minTime = t - 3000
        while (queue.first() < minTime) {
            queue.removeFirst()
        }

        return queue.size
    }
}