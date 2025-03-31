# Inverted Numbered Triangle Pattern in Java

## Description
This Java program prints an inverted numbered triangle pattern based on user input. It prompts the user to enter a size (n) and then prints a pattern where each row starts from `n` and decrements, with rows decreasing in length. The program utilizes loops for pattern generation and the Scanner class for user input handling.

## Code
```java
package number_patterns;
import java.util.Scanner;
public class Inverted_Numbered_Triangle
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = s.nextInt();
        for(int i = 0; i <= n; i++)
        {
            int num = n;
            for(int j = i; j < n; j++)
            {
                System.out.print(num-- + " ");
            }
            System.out.println();
        }
    }
}
```

---

## Explanation
### 1. **Scanner Class**
The `Scanner` class from `java.util` is used to take input from the user. The line:
```java
Scanner s = new Scanner(System.in);
```
creates a Scanner object `s` to read integer input from the console.

### 2. **Variable Declaration**
- `int n = s.nextInt();` → Reads an integer input from the user and stores it in `n`.
- `int num = n;` → A temporary variable initialized to `n` to print numbers in descending order.

### 3. **Outer for Loop**
```java
for(int i = 0; i <= n; i++)
```
- Controls the number of rows in the pattern.
- Runs from `i = 0` to `i = n`, meaning it executes `n+1` times.

### 4. **Inner for Loop**
```java
for(int j = i; j < n; j++)
```
- Controls the number of elements printed in each row.
- Starts from `j = i` and goes up to `n-1`, ensuring that each subsequent row has one less element.

### 5. **Printing the Numbers**
```java
System.out.print(num-- + " ");
```
- Prints the current value of `num` and decrements it (`num--`).
- The space (`" "`) ensures proper formatting.

### 6. **New Line After Each Row**
```java
System.out.println();
```
- Moves the cursor to a new line after printing numbers for the current row.

---

## Sample Input/Output
### **Input:**
```
Enter the size
5
```
### **Output:**
```
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
```

---

## Key Concepts Used
- **Scanner Class** for user input.
- **Nested Loops** for pattern generation.
- **Decrement Operator (`num--`)** to generate numbers in descending order.
- **Formatted Output** using `System.out.print()`.

This program demonstrates fundamental Java concepts such as loops, input handling, and pattern printing, making it useful for beginners in Java programming.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Inverted_Numbered_Triangle.git
```
