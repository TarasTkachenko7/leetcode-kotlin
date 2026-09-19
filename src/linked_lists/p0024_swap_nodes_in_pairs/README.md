# 0024. Swap Nodes in Pairs

- **Сложность:** Medium
- **Паттерн:** Linked List / In-Place Pointer Manipulation
- **Ссылка:** [LeetCode №24](https://leetcode.com/problems/swap-nodes-in-pairs/)

## Идея
Для попарного обмена узлов местами без изменения их значений используется фиктивный узел `dummy`:
1. `dummy.next` указывает на `head`, что позволяет единообразно менять даже первую пару узлов.
2. Указатель `current` стоит перед парой, которую нужно поменять местами.
3. Обозначаем `first = current.next` и `second = first.next`.
4. Перенаправляем указатели:
    - `first.next = second.next` (хвост оставшейся части списка цепляется к `first`);
    - `second.next = first` (`second` теперь указывает на `first`);
    - `current.next = second` (предшествующий узел теперь указывает на новый первый элемент пары).
5. Сдвигаем `current = first` для обработки следующей пары.

## Сложность
- **Time Complexity:** $O(N)$ — однократный проход по всем узлам списка.
- **Space Complexity:** $O(1)$ — обмен ссылок выполняется in-place без создания новых узлов.