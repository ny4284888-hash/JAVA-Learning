# Assignment 8: Matrices – Transpose and Row Sums

## Aim
To create a 2D array, print a matrix, find its transpose and calculate row sums.

## 1. Matrix
A matrix is a collection of numbers arranged in rows and columns.

In Java, we use a 2D array to create a matrix.

```java
int[][] m = new int[3][3];
```

## 2. 2D Array
A 2D array stores data in rows and columns.

Example:
```java
int[][] m = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

## 3. Nested Loops
A loop inside another loop is called a nested loop.
- Outer loop handles rows.
- Inner loop handles columns.

## 4. Matrix Transpose
Transpose means changing rows into columns and columns into rows.

Original:
```text
1 2 3
4 5 6
7 8 9
```

Transpose:
```text
1 4 7
2 5 8
3 6 9
```

Java statement:
```java
transpose[j][i] = m[i][j];
```

## 5. Row Sum
Row sum means adding all numbers of a row.

Example:
- Row 1 = 1 + 2 + 3 = 6
- Row 2 = 4 + 5 + 6 = 15
- Row 3 = 7 + 8 + 9 = 24

## 6. Important Points
- `int[][]` creates a 2D array.
- `m[i][j]` accesses a matrix element.
- Nested loops visit rows and columns.
- Transpose swaps rows and columns.
- A `sum` variable stores the total of a row.

## Conclusion
In this assignment, we learned to create a matrix, print its elements, find its transpose and calculate the sum of each row using Java.