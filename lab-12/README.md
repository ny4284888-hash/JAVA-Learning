# Assignment 12: Insertion Sort

## Aim
To sort arrays in increasing order using Insertion Sort and count the number of shifts.

## 1. What is Insertion Sort?
Insertion Sort is a sorting technique that arranges elements in the correct order, one element at a time.

It takes one element and places it in its correct position in the already sorted part of the array.

## 2. How Insertion Sort Works
1. Start from the second element.
2. Store the current element in a variable called `key`.
3. Compare the key with previous elements.
4. Shift larger elements one position to the right.
5. Place the key in its correct position.
6. Repeat until the array is sorted.

## 3. Example

int[] arr = {7, 3, 5, 1};


**Output:**
Sorted: [1, 3, 5, 7]


## 4. Important Variables


 `arr` - Stores array elements 
 `key` - Stores the current element 
 `i` - Selects the current element 
 `j` - Checks previous elements 
`shifts` - Counts the number of shifts 

## 5. Shift Count
A shift happens when one element moves one position to the right to make space for the key.

For the array `{6, 5, 4, 3, 2, 1}`, the total number of shifts is 15.

**Output:**

Shifts: 15

## 6. Conclusion
In this assignment, we learned how to sort arrays using Insertion Sort and count the number of shifts performed during sorting.
