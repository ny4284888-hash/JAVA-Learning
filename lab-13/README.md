# Assignment 13: Strings – Methods and Palindromes

## Aim
To use common String methods, reverse a word, check a palindrome and print substrings in Java.

## 1. String
A String is a sequence of characters. In Java, String is used to store text.

Example:
String word = "Programming";


## 2. Important String Methods

 Method => Use
 `length()` - Returns the number of characters 
 `indexOf()` - Finds the position of a character 
 `toUpperCase()` - Converts text into capital letters 
 `charAt()` - Returns a character at a given index 
 `substring()` - Extracts a part of a String 
 `equals()` - Compares two Strings 

## 3. Finding String Length and Position

Example:
String word = "Programming";

System.out.println(word.length());
System.out.println(word.indexOf('g'));
System.out.println(word.toUpperCase());


**Output:**

Length: 11
Position of g: 3
Upper case: PROGRAMMING


## 4. Reversing a String
Reversing means writing a word from last character to first character.

Example:

String word = "Java";
String reversed = "";

for (int i = word.length() - 1; i >= 0; i--) {
    reversed = reversed + word.charAt(i);
}


**Output:**

Reversed: avaJ


## 5. Palindrome
A palindrome is a word that reads the same from left to right and right to left.

Example: `racecar`

**Output:**

racecar is a palindrome


## 6. Substrings
A substring is a small part of a String. The `substring()` method is used to extract it.

Example:

String word = "abc";
System.out.println(word.substring(0, 2));


**Output:**

a
ab
abc
b
bc
c


## Conclusion
In this assignment, we learned String methods, reversing a word, checking palindromes and printing all substrings using Java.
