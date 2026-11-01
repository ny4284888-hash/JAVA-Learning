# Assignment 7: Counting Steps and Complexity

## Aim
To count the number of steps performed by a program and understand its time complexity.

## 1. Time Complexity
Time complexity describes how the running time of a program changes when the input size increases.

It helps us understand how efficient a program is.

## 2. Counting Steps
Step counting means calculating how many times a particular statement or loop body executes.

**Example:**
```java
int steps = 0;

for (int i = 1; i <= 10; i++) {
    steps++;
}
```
**Output:**
```text
Steps: 10
```

## 3. Single Loop – O(n)
A single loop runs one after another. If the loop runs 10 times, the statement inside it also runs 10 times.

**Time Complexity:** O(n)

## 4. Nested Loops – O(n²)
A nested loop means one loop inside another loop.

If both loops run 10 times, the inner loop body runs:
```text
10 × 10 = 100 times
```

**Time Complexity:** O(n²)

## 5. While Loop and Halving – O(log n)
A while loop can repeatedly divide a number by 2 until it becomes 1.

**Example:**
```text
1024 → 512 → 256 → 128 → 64
     → 32 → 16 → 8 → 4 → 2 → 1
```

Total divisions = 10

**Time Complexity:** O(log n)

## 6. Important Terms
- `steps++` increases the step counter by 1.
- `for` loop repeats statements a fixed number of times.
- `while` loop repeats while a condition is true.
- `O(n)` represents linear time complexity.
- `O(n²)` represents quadratic time complexity.
- `O(log n)` represents logarithmic time complexity.

## Conclusion
In this assignment, we learned how to count program steps using loops, nested loops and a while loop. We also understood the basic time complexities O(n), O(n²) and O(log n).