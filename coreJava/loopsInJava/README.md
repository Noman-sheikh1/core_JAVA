

# 🔁 **Loops in Java (Complete Guide with Examples & Interview Q&A)**

Loops in Java are used to **execute a block of code multiple times** until a specified condition becomes false.
They help reduce code repetition and make programs more efficient.

---

## 🧩 **Why Use Loops?**

Without loops, if you wanted to print numbers from 1 to 100, you’d need to write 100 print statements!
Loops make it possible to do this with just a few lines of code.

---

## 🔹 **Types of Loops in Java**

1. `for` loop
2. `while` loop
3. `do-while` loop
4. `for-each` loop (Enhanced for loop — mainly for arrays & collections)

---

## 1️⃣ **for Loop**

The `for` loop is used when **you know exactly how many times** you want to execute a block of code.

### 🔸 **Syntax:**

```java
for (initialization; condition; update) {
    // code to be executed
}
```

### 🔸 **Flow:**

1. Initialization (executes once)
2. Condition is checked — if true, enter loop body
3. Code executes
4. Update expression runs
5. Repeats until condition is false

---

### 🔸 **Example:**

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Count: " + i);
}
```

**Output:**

```
Count: 1  
Count: 2  
Count: 3  
Count: 4  
Count: 5
```

---

### 💡 **When to Use:**

* When the number of iterations is **known in advance**.
  Example: Printing 1–10, iterating over an array with known size.

---

### 🧠 **Interview Q:**

**Q:** What happens if you omit all three expressions in a for loop?
**A:** It becomes an **infinite loop**.

```java
for(;;) {
    System.out.println("Infinite Loop");
}
```

---

## 2️⃣ **while Loop**

The `while` loop is used when you **don’t know in advance** how many times to execute the loop —
it continues as long as the condition remains true.

### 🔸 **Syntax:**

```java
while (condition) {
    // code to be executed
}
```

### 🔸 **Example:**

```java
int i = 1;

while (i <= 5) {
    System.out.println("Number: " + i);
    i++;
}
```

**Output:**

```
Number: 1  
Number: 2  
Number: 3  
Number: 4  
Number: 5
```

---

### 💡 **When to Use:**

* When the number of iterations is **unknown** beforehand.
  Example: Reading user input until a specific value is entered.

---

### 🧠 **Interview Q:**

**Q:** What is the main difference between a `for` loop and a `while` loop?
**A:**

* Use `for` when you know how many times to loop.
* Use `while` when you don’t know how many times (condition-based).

---

## 3️⃣ **do-while Loop**

The `do-while` loop is similar to `while`, but it **executes the loop body at least once**,
**even if the condition is false**.

### 🔸 **Syntax:**

```java
do {
    // code to be executed
} while (condition);
```

### 🔸 **Example:**

```java
int i = 6;

do {
    System.out.println("Value: " + i);
    i++;
} while (i <= 5);
```

**Output:**

```
Value: 6
```

👉 The loop runs once **even though the condition is false** (i.e., `6 <= 5` is false).

---

### 💡 **When to Use:**

* When you **must execute the block at least once**, regardless of the condition.
  Example: Taking user input at least once before checking validity.

---

### 🧠 **Interview Q:**

**Q:** Difference between `while` and `do-while` loop?
**A:**

* `while` checks the condition **before** execution.
* `do-while` checks the condition **after** execution (executes at least once).

---

## 4️⃣ **for-each Loop (Enhanced for Loop)**

Introduced in Java 5, the **for-each loop** is used to **iterate through arrays or collections** easily.
It automatically handles indexing and makes code cleaner.

### 🔸 **Syntax:**

```java
for (type variable : arrayName) {
    // code to be executed
}
```

### 🔸 **Example:**

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int num : numbers) {
    System.out.println(num);
}
```

**Output:**

```
10  
20  
30  
40  
50
```

---

### 💡 **When to Use:**

* When you just need to **access** elements of an array or collection,
  not modify the index.

---

### 🧠 **Interview Q:**

**Q:** Can we modify array elements using a for-each loop?
**A:**
No, we **cannot change** elements directly. Use a traditional `for` loop if modification is needed.

---

## ⚙️ **Control Statements Inside Loops**

### 🔸 **break** — exit the loop immediately

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3)
        break;
    System.out.println(i);
}
```

**Output:**

```
1  
2
```

---

### 🔸 **continue** — skip current iteration and move to the next

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3)
        continue;
    System.out.println(i);
}
```

**Output:**

```
1  
2  
4  
5
```

---

### 🔸 **Nested Loops**

You can place one loop inside another — used for **patterns**, **matrices**, etc.

#### Example:

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print(i + "," + j + "  ");
    }
    System.out.println();
}
```

**Output:**

```
1,1  1,2  1,3  
2,1  2,2  2,3  
3,1  3,2  3,3
```

---

## 💡 **When to Use Which Loop**

| Loop Type  | When to Use                                  | Executes At Least Once | Example Scenario             |
| ---------- | -------------------------------------------- | ---------------------- | ---------------------------- |
| `for`      | When number of iterations is **known**       | ❌                      | Printing numbers 1–10        |
| `while`    | When number of iterations is **unknown**     | ❌                      | Reading user input until 'q' |
| `do-while` | When you must execute **at least once**      | ✅                      | Login retry prompt           |
| `for-each` | When iterating through arrays or collections | ❌                      | Printing array elements      |

---

## 🧠 **Common Interview Questions & Answers**

### Q1️⃣: Can we use multiple variables in a for loop?

✅ **Yes** — Example:

```java
for (int i = 0, j = 10; i < j; i++, j--) {
    System.out.println(i + " " + j);
}
```

---

### Q2️⃣: What is an infinite loop? Give an example.

**Ans:** A loop that never terminates because its condition always remains true.

```java
while (true) {
    System.out.println("Running forever...");
}
```

---

### Q3️⃣: What’s the difference between `break` and `continue`?

* `break` → exits the loop completely.
* `continue` → skips current iteration and goes to next one.

---

### Q4️⃣: Can a loop exist inside another loop?

✅ Yes, it’s called a **nested loop**. Common in pattern printing or matrix operations.

---

### Q5️⃣: Can we write a `for` loop without any statement inside parentheses?

✅ Yes. All three expressions are **optional**:

```java
int i = 1;
for (; i <= 3; ) {
    System.out.println(i);
    i++;
}
```

---

## 🚀 **Summary Table**

| Loop Type  | Checks Condition | Executes at least once | Best Use Case              |
| ---------- | ---------------- | ---------------------- | -------------------------- |
| `for`      | Before loop      | No                     | Fixed number of iterations |
| `while`    | Before loop      | No                     | Unknown iterations         |
| `do-while` | After loop       | Yes                    | Must run at least once     |
| `for-each` | Implicit         | No                     | Arrays / Collections       |

---


