# 0034. Find First and Last Position of Element in Sorted Array

- **Сложность:** Medium
- **Паттерн:** Binary Search
- **Ссылка:** [LeetCode №34](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)

## Идея
Для нахождения первого и последнего вхождения элемента в отсортированном массиве за $O(\log N)$ бинарный поиск запускается дважды:
1. Реализуем вспомогательную функцию `findBound(nums, target, isFirst)`:
    - При совпадении `nums[mid] == target` фиксируем найденную позицию `bound = mid`.
    - Если ищем левую границу (`isFirst == true`), продолжаем поиск слева: `right = mid - 1`.
    - Если ищем правую границу (`isFirst == false`), продолжаем поиск справа: `left = mid + 1`.
2. В основном методе `searchRange`:
    - Находим первое вхождение `first`.
    - Если `first == -1`, элемента в массиве нет — сразу возвращаем `[-1, -1]`.
    - Находим последнее вхождение `second` и возвращаем диапазон `[first, second]`.

## Сложность
- **Time Complexity:** $O(\log N)$ — два последовательных запуска бинарного поиска по массиву длины $N$.
- **Space Complexity:** $O(1)$ — используются только константные числовые переменные.