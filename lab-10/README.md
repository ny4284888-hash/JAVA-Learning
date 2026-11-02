# Assignment 10: Switch and ArrayList

## Aim
To use a switch statement and perform basic operations on an ArrayList in Java.

## 1. Switch Statement
A switch statement is used to select one option from multiple choices.

Example:
```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

**Output:**
```text
Wednesday
```

## 2. ArrayList
ArrayList is used to store multiple values in a list. Its size can increase or decrease.

To use ArrayList, we import:
```java
import java.util.ArrayList;
```

Create an ArrayList:
```java
ArrayList<Integer> list = new ArrayList<>();
```

## 3. Adding Elements
The `add()` method adds elements to an ArrayList.

```java
list.add(10);
list.add(20);
list.add(30);
list.add(40);
```

## 4. Accessing Elements
- `get(index)` accesses an element.
- `size()` returns the number of elements.

## 5. Updating and Removing Elements
- `set(index, value)` updates an element.
- `remove(index)` removes an element.

Example:
```java
list.set(1, 25);
list.remove(3);
```

## 6. Important Methods

| Method | Use |
|---|---|
| `add()` | Adds an element |
| `get()` | Accesses an element |
| `size()` | Returns list size |
| `set()` | Updates an element |
| `remove()` | Removes an element |

## Conclusion
In this assignment, we learned how to use a switch statement and add, access, update and remove elements from an ArrayList.
