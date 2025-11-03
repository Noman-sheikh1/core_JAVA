
# 🧮 Operators in Java

In Java, **operators** are special symbols that perform operations on variables and values.
For example: `+`, `-`, `*`, `/`, etc.

Java operators are classified into **different types** based on their functionality.

---

## 🧠 1. Arithmetic Operators

Used to perform basic mathematical operations.

| Operator | Description         | Example  | Result |
| -------- | ------------------- | -------- | ------ |
| `+`      | Addition            | `5 + 3`  | `8`    |
| `-`      | Subtraction         | `5 - 3`  | `2`    |
| `*`      | Multiplication      | `5 * 3`  | `15`   |
| `/`      | Division            | `10 / 2` | `5`    |
| `%`      | Modulus (Remainder) | `10 % 3` | `1`    |

**Example:**

```java
int a = 10, b = 5;
System.out.println(a + b); // 15
System.out.println(a - b); // 5
System.out.println(a * b); // 50
System.out.println(a / b); // 2
System.out.println(a % b); // 0
```

---

## ⚙️ 2. Assignment Operators

Used to assign values to variables.

| Operator | Description         | Example   | Equivalent To |
| -------- | ------------------- | --------- | ------------- |
| `=`      | Assign value        | `a = 10;` | —             |
| `+=`     | Add and assign      | `a += 5;` | `a = a + 5;`  |
| `-=`     | Subtract and assign | `a -= 3;` | `a = a - 3;`  |
| `*=`     | Multiply and assign | `a *= 2;` | `a = a * 2;`  |
| `/=`     | Divide and assign   | `a /= 2;` | `a = a / 2;`  |
| `%=`     | Modulus and assign  | `a %= 3;` | `a = a % 3;`  |

**Example:**

```java
int a = 10;
a += 5; // a = 15
a -= 3; // a = 12
a *= 2; // a = 24
a /= 4; // a = 6
a %= 5; // a = 1
```

---

## 🔍 3. Relational (Comparison) Operators

Used to compare two values.
They return **true** or **false**.

| Operator | Description              | Example  | Result  |
| -------- | ------------------------ | -------- | ------- |
| `==`     | Equal to                 | `a == b` | `false` |
| `!=`     | Not equal to             | `a != b` | `true`  |
| `>`      | Greater than             | `a > b`  | `true`  |
| `<`      | Less than                | `a < b`  | `false` |
| `>=`     | Greater than or equal to | `a >= b` | `true`  |
| `<=`     | Less than or equal to    | `a <= b` | `false` |

**Example:**

```java
int a = 10, b = 20;
System.out.println(a > b);  // false
System.out.println(a < b);  // true
System.out.println(a == b); // false
System.out.println(a != b); // true
```

---

## 🧩 4. Logical Operators

Used to combine multiple conditions.

| Operator | Description | Example            | Result            |         
| -------- | ----------- | ------------------ | ----------------- | 
| `&&`     | Logical AND | `(a > 5 && b > 5)` | true if both true |         
| `||`     | Logical OR  | `(a>5||b>5)`       | Logical OR        | 
| `!`      | Logical NOT | `!(a > 5)`         | reverses result   |        

**Example:**

```java
int a = 10, b = 20;
System.out.println(a > 5 && b > 5); // true
System.out.println(a > 5 || b < 10); // true
System.out.println(!(a > 5)); // false
```

---

## 🧾 5. Unary Operators

Operate on a **single operand**.

| Operator | Description                 | Example | Result         |
| -------- | --------------------------- | ------- | -------------- |
| `++`     | Increment                   | `++a`   | `a = a + 1`    |
| `--`     | Decrement                   | `--a`   | `a = a - 1`    |
| `+`      | Unary plus (positive value) | `+a`    | Same value     |
| `-`      | Unary minus (negation)      | `-a`    | Negative value |
| `!`      | Logical NOT                 | `!true` | `false`        |

**Example:**

```java
int a = 5;
System.out.println(++a); // 6 (pre-increment)
System.out.println(a++); // 6 (prints old value, then a=7)
System.out.println(--a); // 6 (pre-decrement)
System.out.println(-a);  // -6
```

---

## 🧮 6. Bitwise Operators

Operate on bits (binary representation) of numbers.

| Operator | Description          | Example    | Result                      |    
| -------- | -------------------- | ---------- | --------------------------- | 
| `&`      | Bitwise AND          | `a & b`    | Performs AND on bits        |    
| `|`      | Bitwise OR           | `a|b`      | Performs OR on bits         |
| `^`      | Bitwise XOR          | `a ^ b`    | XOR on bits                 |   
| `~`      | Bitwise NOT          | `~a`       | Inverts bits                |   
| `<<`     | Left shift           | `a << 2`   | Shifts bits left            |   
| `>>`     | Right shift          | `a >> 2`   | Shifts bits right           |    
| `>>>`    | Unsigned right shift | `a >>> 2`  | Shifts right with zero fill |    

**Example:**

```java
int a = 5, b = 3;
System.out.println(a & b);  // 1
System.out.println(a | b);  // 7
System.out.println(a ^ b);  // 6
System.out.println(~a);     // -6
System.out.println(a << 1); // 10
System.out.println(a >> 1); // 2
```

---

## ⚖️ 7. Ternary Operator

Used as a shorthand for `if-else`.

**Syntax:**

```java
variable = (condition) ? value_if_true : value_if_false;
```

**Example:**

```java
int a = 10, b = 20;
int max = (a > b) ? a : b;
System.out.println(max); // 20
```

---

## 🧱 8. Type Comparison Operator (`instanceof`)

Used to test whether an object is an instance of a particular class or subclass.

**Example:**

```java
String str = "Hello";
System.out.println(str instanceof String); // true
```

---

## ⚙️ 9. Miscellaneous Operators

| Operator | Description            | Example                      |
| -------- | ---------------------- | ---------------------------- |
| `new`    | Creates new object     | `Student s = new Student();` |
| `[]`     | Array subscript        | `arr[0]`                     |
| `.`      | Access member of class | `obj.method()`               |
| `,`      | Separates expressions  | `int a=1, b=2;`              |

---



---


