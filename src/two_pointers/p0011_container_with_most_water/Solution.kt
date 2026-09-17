package two_pointers.p0011_container_with_most_water

class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.lastIndex
        var maxArea = 0

        while (left < right) {
            val hLeft = height[left]
            val hRight = height[right]
            val minH = if (hLeft < hRight) hLeft else hRight
            val currentArea = (right - left) * minH

            if (currentArea > maxArea) {
                maxArea = currentArea
            }

            if (hLeft < hRight) {
                while (left < right && height[left] <= minH) {
                    left++
                }
            } else {
                while (left < right && height[right] <= minH) {
                    right--
                }
            }
        }

        return maxArea
    }
}