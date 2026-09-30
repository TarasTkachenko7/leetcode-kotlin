package stack.p0155_min_stack

class MinStack {

    private class Element(val value: Int, val min: Int)
    private val stack = ArrayDeque<Element>()

    fun push(value: Int) {
        if (stack.isEmpty()) {
            stack.addLast(Element(value, value))
        } else {
            val currentMin = minOf(value, stack.last().min)
            stack.addLast(Element(value, currentMin))
        }
    }

    fun pop() {
        stack.removeLast()
    }

    fun top(): Int {
        return stack.last().value
    }

    fun getMin(): Int {
        return stack.last().min
    }
}