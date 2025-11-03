
# 🧠 Conditional Statements in Java

Conditional statements in Java are used to **control the flow of execution** based on certain conditions (true or false).
They help the program **make decisions** — just like *“if this happens, do that.”*

---

## 🔹 Types of Conditional Statements in Java

1. `if` statement
2. `if-else` statement
3. `nested if` statement
4. `if-else-if` ladder
5. `switch` statement
6. (Bonus) **Ternary Operator (`?:`)** — a shorthand form of `if-else`

---

## 1️⃣ **if Statement**

The `if` statement is the simplest form of a conditional statement.
It executes a block of code **only if the condition is true**.

### 🔸 Syntax:

```java
if (condition) {
    // code to be executed if condition is true
}
```

### 🔸 Example:

```java
int age = 20;

if (age >= 18) {
    System.out.println("You are eligible to vote.");
}
```

**Output:**

```
You are eligible to vote.
```

---

## 2️⃣ **if-else Statement**

The `if-else` statement provides two paths:

* One when the condition is **true**,
* Another when it is **false**.

### 🔸 Syntax:

```java
if (condition) {
    // executes when condition is true
} else {
    // executes when condition is false
}
```

### 🔸 Example:

```java
int number = 10;

if (number % 2 == 0) {
    System.out.println("Even number");
} else {
    System.out.println("Odd number");
}
```

**Output:**

```
Even number
```

---

## 3️⃣ **Nested if Statement**

A nested `if` means placing one `if` inside another.
It is useful when we have **multiple conditions to check**.

### 🔸 Syntax:

```java
if (condition1) {
    if (condition2) {
        // code to execute if both conditions are true
    }
}
```

### 🔸 Example:

```java
int age = 25;
boolean hasVoterID = true;

if (age >= 18) {
    if (hasVoterID) {
        System.out.println("You can vote.");
    } else {
        System.out.println("Please apply for voter ID.");
    }
} else {
    System.out.println("You are not eligible to vote yet.");
}
```

**Output:**

```
You can vote.
```

---

## 4️⃣ **if-else-if Ladder**

The `if-else-if` ladder is used when there are **multiple conditions**,
and only **one block** of code should execute.

### 🔸 Syntax:

```java
if (condition1) {
    // code block 1
} else if (condition2) {
    // code block 2
} else if (condition3) {
    // code block 3
} else {
    // default block (if none are true)
}
```

### 🔸 Example:

```java
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 50) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

**Output:**

```
Grade B
```

---

## 5️⃣ **switch Statement**

The `switch` statement is used to **replace multiple if-else-if** blocks when comparing a single variable to different values.
It’s **cleaner and more readable** for such cases.

### 🔸 Syntax:

```java
switch (expression) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    ...
    default:
        // default code block
}
```

### 🔸 Example:

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
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    default:
        System.out.println("Weekend");
}
```

**Output:**

```
Wednesday
```

> ⚙️ Note:
>
> * Use `break` to stop further checking after a match.
> * If `break` is omitted, execution “falls through” to the next case.

---

## 6️⃣ **Ternary Operator (`?:`)**

This is a **short-hand version** of `if-else`.
It’s very common in **interviews** and **coding challenges**.

### 🔸 Syntax:

```java
variable = (condition) ? value_if_true : value_if_false;
```

### 🔸 Example:

```java
int number = 10;
String result = (number % 2 == 0) ? "Even" : "Odd";

System.out.println(result);
```

**Output:**

```
Even
```

---

## ⚡ Interview Tips & Key Points

✅ Conditional statements always evaluate to **boolean (true/false)**.
✅ Use `switch` instead of multiple `if-else-if` when comparing **same variable** to different values.
✅ In Java 14+, you can use **switch expressions** with `->` syntax (modern approach).
✅ Nested `if` should be avoided if it makes code complex — use logical operators (`&&`, `||`) instead.
✅ Ternary operator is great for **one-line decisions**.

---

## 🧩 Example: Combining Logical and Conditional Statements

```java
int age = 22;
boolean hasLicense = true;

if (age >= 18 && hasLicense) {
    System.out.println("You can drive!");
} else {
    System.out.println("You cannot drive!");
}
```

**Output:**

```
You can drive!
```

---

## 🚀 Summary Table

| Type                | Description                        | Example Keyword                        |
| ------------------- | ---------------------------------- | -------------------------------------- |
| `if`                | Executes code if condition is true | `if (x > 10)`                          |
| `if-else`           | Chooses between two alternatives   | `if ... else`                          |
| `nested if`         | `if` inside another `if`           | multiple conditions                    |
| `if-else-if ladder` | Multiple possible conditions       | `if ... else if ... else`              |
| `switch`            | Multiple choices for one variable  | `switch (value)`                       |
| `?:` (ternary)      | Short form of `if-else`            | `(condition) ? trueValue : falseValue` |

---


