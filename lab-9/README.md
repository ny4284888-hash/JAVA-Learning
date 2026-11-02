# Assignment 9: Matrices – Rows and Columns

## Aim
To use nested loops to print rows, calculate column sums and count values in a matrix.

## 1. Matrix
A matrix is a collection of numbers arranged in rows and columns.

In Java, we use a 2D array to create a matrix.

```java
int[][] m = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

## 2. First Row and Last Row
- `m[0]` represents the first row.
- `m[2]` represents the last row.
- We use a loop to print all values of a row.

**Output:**
```text
First row: 1 2 3
Last row: 7 8 9
```

## 3. Sum of Each Column
Column sum means adding all values present in one column.

Example:
- Column 1 = 1 + 4 + 7 = 12
- Column 2 = 2 + 5 + 8 = 15
- Column 3 = 3 + 6 + 9 = 18

**Output:**
```text
Column 1 sum: 12
Column 2 sum: 15
Column 3 sum: 18
```

## 4. Count Values Greater Than 5
We use an `if` condition to check values greater than 5.

Values are: 6, 7, 8, 9

Total count = 4

**Output:**
```text
Values greater than 5: 4
```

## 5. Important Concepts
- `int[][]` is used to create a 2D array.
- Nested loops visit rows and columns.
- `m[i][j]` accesses a matrix element.
- `sum` stores the total of a column.
- `if` checks a condition.
- `count++` increases the count by 1.

## Conclusion
In this assignment, we learned how to print the first and last rows, calculate the sum of each column and count values greater than 5 using Java.