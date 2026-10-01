package stack.p0739_daily_temperatures

class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val answer = IntArray(temperatures.size)
        val stack = ArrayDeque<Int>()

        for (index in temperatures.indices) {
            while (stack.isNotEmpty() && temperatures[index] > temperatures[stack.last()]) {
                val prevIndex = stack.removeLast()
                answer[prevIndex] = index - prevIndex
            }
            stack.addLast(index)
        }

        return answer
    }
}