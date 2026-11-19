# 0303. Range Sum Query - Immutable

- **Сложность:** Easy
- **Паттерн:** Prefix Sum
- **Ссылка:** [LeetCode №303](https://leetcode.com/problems/range-sum-query-immutable/)

## Идея
При создании `NumArray` проходим по массиву один раз. Переменная `runningSum` накапливает сумму, а `prefixSums[i]` хранит сумму от начала массива до индекса `i` включительно.

Для запроса берём `prefixSums[right]` и вычитаем сумму элементов перед `left`. При `left == 0` вычитаем ноль. В остальных случаях вычитаем `prefixSums[left - 1]`.

## Сложность
- **Time Complexity:** $O(n)$ на построение массива префиксных сумм и $O(1)$ на запрос.
- **Space Complexity:** $O(n)$ для хранения префиксных сумм.
