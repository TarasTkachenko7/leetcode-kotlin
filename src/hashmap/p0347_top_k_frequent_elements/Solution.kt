package hashmap.p0347_top_k_frequent_elements

class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val frequencyMap = HashMap<Int, Int>()

        for (num in nums) {
            frequencyMap[num] = (frequencyMap[num] ?: 0) + 1
        }

        val buckets = Array(nums.size + 1) { mutableListOf<Int>() }
        for ((num, count) in frequencyMap) {
            buckets[count].add(num)
        }

        val result = IntArray(k)
        var resultIndex = 0

        for (freq in buckets.indices.reversed()) {
            for (num in buckets[freq]) {
                result[resultIndex++] = num
                if (resultIndex == k) {
                    return result
                }
            }
        }

        return result
    }
}