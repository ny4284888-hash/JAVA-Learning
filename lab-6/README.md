# Assignment 6: Arrays – Reverse and Duplicates

## Aim
To print an array in reverse order, find the smallest value and its index, and check an array for repeated values.

## 1. Array
An array is a collection of elements of the same data type stored in a single variable.

**Example:**
```java
int arr[] = {10, 20, 30, 40, 50};
```

## 2. Reverse Traversal
Reverse traversal means accessing and printing array elements from the last position to the first position.

**Example:**
```java
for (int i = arr.length - 1; i >= 0; i--) {
    System.out.println(arr[i]);
}
```

## 3. Smallest Element
The smallest element is the minimum value present in an array. We can find it by comparing each element using an if condition.

**Example:**
```text
Array: 2, 5, 1, 8, 3, 4
Smallest: 1
```

## 4. Index of an Element
Index represents the position of an element in an array. Array indexing starts from 0.

In the above example, the smallest value 1 is present at index 2.

## 5. Nested Loops
A nested loop means using one loop inside another loop. It is useful for comparing array elements with each other.

**Example:**
```java
for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        // Compare elements
    }
}
```

## 6. Duplicate or Repeated Values
A duplicate value is a value that appears more than once in an array.

**Example:**
```text
Array: 4, 9, 2, 9, 7
Repeated value: 9
```

We use the `==` operator to compare two array elements.

## 7. Boolean Variable
A boolean variable stores either `true` or `false`. It can be used to check whether a repeated value is found.

**Example:**
```java
boolean found = false;
```

## 8. Important Concepts
- `arr.length` gives the total number of elements.
- `i--` decreases the loop variable by 1.
- `==` compares two values.
- `break` stops a loop.
- Nested loops help compare multiple array elements.

## Conclusion
In this assignment, we learned how to print array elements in reverse order, find the smallest element and its index, and identify repeated values using nested loops.