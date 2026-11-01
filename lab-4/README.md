# Assignment 4: Writing Functions

## Aim
To write Java functions with parameters and return values and call them from the main() method.

## 1. Function / Method
A function is a block of code that performs a specific task. In Java, functions are called methods.

Methods help us reuse code and make programs easier to understand.

## 2. Parameters
Parameters are variables written inside the parentheses of a method. They receive values when the method is called.

Example:
```java
static int add(int a, int b) {
    return a + b;
}
```
Here, `a` and `b` are parameters.

## 3. Return Value
The return statement sends a result back from a method.

Example:
```java
static int square(int n) {
    return n * n;
}
```
Here, `int` is the return type.

## 4. Calling a Function
A method is called by writing its name and passing the required values.

Example:
```java
int result = square(5);
```

## 5. Factorial
Factorial is the product of all positive integers from 1 to a given number.

Example:
```text
5! = 5 × 4 × 3 × 2 × 1 = 120
```

A loop can be used to calculate factorial.

## 6. Combination (nCr)
Combination is used to find the number of ways to select items when order does not matter.

Formula:
```text
nCr = n! / (r! × (n-r)!)
```

Example:
```text
5C2 = 10
```

## 7. Permutation (nPr)
Permutation is used to find the number of ways to arrange items when order matters.

Formula:
```text
nPr = n! / (n-r)!
```

Example:
```text
5P2 = 20
```

## 8. Maximum of Two Numbers
The `maxOf()` method compares two numbers and returns the larger value.

Example:
```java
static int maxOf(int a, int b) {
    if (a > b) {
        return a;
    } else {
        return b;
    }
}
```

## 9. Main Method
The `main()` method is the starting point of a Java program. We can call other methods from it.

## Conclusion
In this assignment, we learned how to create and call methods, use parameters and return values, calculate factorial, combination, permutation and find the maximum of two numbers.