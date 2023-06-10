# Problem Statement:

Design a stack data structure that supports three operations: `Push(int i)`, `Pop()`, and `print(versionSnapshot)`. The
expected time complexity for `Push` and `Pop` operations is O(1), while the expected time complexity for `print`
operation is O(stackSize), where stackSize refers to the current size of the stack.

Example:

Consider an empty stack.

1. Push(1): The stack becomes [1]. This is Version #1.
2. Push(2): The stack becomes [1, 2]. This is Version #2.
3. Push(3): The stack becomes [1, 2, 3]. This is Version #3.
4. print(3): The stack elements for Version #3 are [3, 2, 1].
5. print(2): The stack elements for Version #2 are [2, 1].
6. Pop(): The top element is removed from the stack. The stack becomes [1]. This is Version #4.
7. Pop(): The top element is removed from the stack. The stack becomes empty. This is Version #5.
8. print(5): The stack elements for Version #5 are [1].
9. print(4): The stack elements for Version #4 are [2, 1].

Your task is to implement the stack data structure with the specified operations and ensure the expected time
complexities for each operation.

Note: The "versionSnapshot" parameter in the `print` operation refers to the specific version number for which the stack
elements need to be printed.