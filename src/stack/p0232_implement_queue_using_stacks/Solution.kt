package stack.p0232_implement_queue_using_stacks

class MyQueue {

    private val inStack = ArrayDeque<Int>()
    private val outStack = ArrayDeque<Int>()

    fun push(x: Int) {
        inStack.addLast(x)
    }

    fun pop(): Int {
        shiftStacks()
        return outStack.removeLast()
    }

    fun peek(): Int {
        shiftStacks()
        return outStack.last()
    }

    fun empty(): Boolean {
        return inStack.isEmpty() && outStack.isEmpty()
    }

    private fun shiftStacks() {
        if (outStack.isEmpty()) {
            while (inStack.isNotEmpty()) {
                outStack.addLast(inStack.removeLast())
            }
        }
    }
}