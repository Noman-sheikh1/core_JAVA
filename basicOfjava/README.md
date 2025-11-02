

````markdown
# 🧠 Java — Overview Notes

## 🔹 Definition

- **Java** is a **high-level, object-oriented, platform-independent programming language** developed by **James Gosling** at **Sun Microsystems** in **1995** (now owned by Oracle).  
- It follows the **“Write Once, Run Anywhere (WORA)”** principle — meaning Java code can run on any device that has a **Java Virtual Machine (JVM)**.

---

## 🔹 Key Features

1. **Object-Oriented:**  
   Everything in Java is treated as an object (supports concepts like class, inheritance, polymorphism, encapsulation, abstraction).

2. **Platform-Independent:**  
   Java code is compiled into **bytecode**, which runs on the **JVM** — making it work on any OS (Windows, macOS, Linux, etc.).

3. **Simple and Familiar:**  
   Syntax is similar to C and C++, but without complex features like pointers or multiple inheritance.

4. **Secure:**  
   Java provides a **security manager**, **bytecode verification**, and runs in a **sandbox environment**, preventing unauthorized access.

5. **Robust:**  
   Handles errors through **exception handling** and avoids memory leaks with **automatic garbage collection**.

6. **Multithreaded:**  
   Supports multiple threads (tasks) running simultaneously for better performance.

7. **Portable:**  
   Java programs are platform-independent at both source and binary levels.

8. **High Performance:**  
   JVM uses a **Just-In-Time (JIT)** compiler to convert bytecode into native machine code at runtime, improving speed.

9. **Distributed:**  
   Supports distributed computing using **RMI (Remote Method Invocation)** and **EJB (Enterprise JavaBeans)**.

---

## 🔹 Java Architecture

1. **JDK (Java Development Kit):**  
   Used by developers to write and compile code (includes JRE + development tools).

2. **JRE (Java Runtime Environment):**  
   Provides libraries and JVM to run Java applications.

3. **JVM (Java Virtual Machine):**  
   Converts bytecode into machine code and executes it.

---

## 🔹 Execution Process

1. Write code → `MyProgram.java`  
2. Compile → `javac MyProgram.java` → generates `MyProgram.class` (bytecode)  
3. Run → `java MyProgram` → executed by JVM  

---

## 🔹 Advantages of Java

- Platform-independent  
- Secure and reliable  
- Object-oriented  
- Automatic memory management  
- Rich standard library  

---

## 🔹 Applications of Java

- Web development (**Spring**, **JSP**, **Servlets**)  
- Mobile apps (**Android**)  
- Enterprise applications  
- Cloud-based systems  
- Embedded systems  
- Big Data and Machine Learning  

---

## 🔹 Example Code

```java
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
````

## 🧩 Java Program Execution Workflow

When you write and run a Java program, the following process takes place:

```
1️⃣  You create a Java program and save it using the `.java` extension.
     Example: HelloWorld.java

2️⃣  The Java Compiler (`javac`) compiles the source code.
     ➤ It checks syntax and converts the code into bytecode.
     ➤ A new file is created with the `.class` extension.
     Example: HelloWorld.class

3️⃣  The Java Virtual Machine (JVM) reads the `.class` file.
     ➤ JVM uses the bytecode and executes it line by line.

4️⃣  The JVM looks for the entry point method:
     public static void main(String[] args)
     ➤ This is where the program starts executing.

5️⃣  The Java Runtime Environment (JRE) provides the required libraries
     and environment for the JVM to run the program smoothly.

6️⃣  The output of the program is displayed on the console.
```

---

## ⚙️ Example

```java
package basicOfjava;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

---

## 🧠 Summary Diagram (Text Version)

```
Source Code (.java)
        ↓
Compilation (javac)
        ↓
Bytecode (.class)
        ↓
JVM (Java Virtual Machine)
        ↓
JRE (Java Runtime Environment)
        ↓
Program Execution → Output
```

## 🧩 What is a Variable in Java?

A **variable** in Java is like a **container** that stores a piece of data (a value) in your program.
It gives a **name** to a memory location so you can easily use and modify that value later.

---

## 🧠 Think of it Like:

Imagine a variable as a **labeled box** 🗃️ where you can keep something (a value) and refer to it by its label (the variable name).

Example:
📦 `int age = 20;`
Here, the box label is **age**, and inside the box, we store **20**.

---

## ⚙️ Syntax

```java
dataType variableName = value;
```

Example:

```java
int number = 10;
String name = "Noman";
float pi = 3.14f;
```

---

## 📚 Explanation

| Part     | Meaning                                                            |
| -------- | ------------------------------------------------------------------ |
| `int`    | Data type → defines what kind of value it can hold (integer here). |
| `number` | Variable name → label for the memory location.                     |
| `10`     | Value stored inside the variable.                                  |

---

## 🧩 Types of Variables in Java

Java has **three main types** of variables:

1. **Local Variable**

   * Declared **inside a method or block**.
   * Can be used **only within that method**.
     Example:

   ```java
   void display() {
       int x = 5;   // local variable
       System.out.println(x);
   }
   ```

2. **Instance Variable**

   * Declared **inside a class but outside any method**.
   * Each object of the class has its own copy.
     Example:

   ```java
   class Student {
       String name;   // instance variable
   }
   ```

3. **Static Variable**

   * Declared using the **`static`** keyword.
   * Shared among **all objects** of the class.
     Example:

   ```java
   class Student {
       static String school = "ABC School";
   }
   ```

---


Java has **3 main types** of variables 👇

| Type                  | Where It’s Declared                       | Exists Till                      | Who Can Use It                      | Example                         |
| --------------------- | ----------------------------------------- | -------------------------------- | ----------------------------------- | ------------------------------- |
| **Local Variable**    | Inside a method, constructor, or block    | Only while the method is running | Only that method                    | Inside `main()` or any function |
| **Instance Variable** | Inside a class but **outside any method** | Till the object is alive         | Each object gets its own copy       | `name`, `age`                   |
| **Static Variable**   | Inside a class with **static keyword**    | Till the program ends            | Shared by all objects of that class | `schoolName`, `companyName`     |

---

## ⚔️ Instance Variable vs Static Variable (Main Difference)

Let’s take a simple real-world example 👇

### 🧩 Example 1: Instance and Static Variable Together

```java
class Student {
    // Instance variable
    String name;
    
    // Static variable
    static String school = "ABC School";

    Student(String n) {
        name = n;
    }

    void display() {
        System.out.println(name + " studies in " + school);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Noman");
        Student s2 = new Student("Ayaan");

        s1.display();
        s2.display();

        // Change static variable using one object
        s2.school = "XYZ School";

        System.out.println("\nAfter changing school name:\n");
        s1.display();
        s2.display();
    }
}
```

### 🖥️ Output

```
Noman studies in ABC School
Ayaan studies in ABC School

After changing school name:

Noman studies in XYZ School
Ayaan studies in XYZ School
```

---

## 🧠 Explanation

| Feature              | **Instance Variable**                        | **Static Variable**                               |
| -------------------- | -------------------------------------------- | ------------------------------------------------- |
| **Belongs To**       | Each object (instance of class)              | The class itself                                  |
| **Keyword**          | No keyword                                   | Declared using `static`                           |
| **Memory Copy**      | Each object has **its own copy**             | All objects share **one common copy**             |
| **When Created**     | When object is created                       | When class is loaded into memory                  |
| **When Deleted**     | When object is destroyed                     | When program ends                                 |
| **How to Access**    | Using object reference                       | Using class name                                  |
| **Storage Location** | Heap memory (inside object)                  | Method area (class-level memory)                  |
| **Example Use**      | Data that differs per object → `name`, `age` | Common data for all → `schoolName`, `companyName` |

---

## 🎯 Easy Way to Remember

👉 **Instance = Individual**

* Each object has its own copy.
* Example: Noman and Ayaan have different `name`.

👉 **Static = Shared**

* One copy shared by all objects.
* Example: All students have the same `school`.

---

## 🧩 Example 2: Showing Both Together

```java
class Employee {
    // Instance variable (unique for every employee)
    String name;
    int id;
    
    // Static variable (same for all employees)
    static String company = "TechCorp";

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showDetails() {
        System.out.println("Employee Name: " + name + ", ID: " + id + ", Company: " + company);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Noman", 101);
        Employee e2 = new Employee("Ayaan", 102);

        e1.showDetails();
        e2.showDetails();

        // Change static variable
        Employee.company = "CodeWorks";

        System.out.println("\nAfter company change:\n");
        e1.showDetails();
        e2.showDetails();
    }
}
```

### 🖥️ Output:

```
Employee Name: Noman, ID: 101, Company: TechCorp
Employee Name: Ayaan, ID: 102, Company: TechCorp

After company change:

Employee Name: Noman, ID: 101, Company: CodeWorks
Employee Name: Ayaan, ID: 102, Company: CodeWorks
```


---

# 🧠 Java Data Types (Simplified Notes)

Java is a **statically typed** language — meaning each variable’s **type is known at compile time**.
Every variable in Java must have a **data type** that defines the **size, range, and type of values** it can hold.

---

## 🔹 Categories of Data Types

Java data types are divided into **two main categories**:

| Category                                 | Description                                            | Examples                                                             |
| ---------------------------------------- | ------------------------------------------------------ | -------------------------------------------------------------------- |
| **Primitive Data Types**                 | Store **simple values directly** in memory.            | `boolean`, `byte`, `char`, `short`, `int`, `long`, `float`, `double` |
| **Non-Primitive (Reference) Data Types** | Store **references (addresses)** of objects in memory. | `String`, `Array`, `Class`, `Interface`, `Object`                    |

---

## 🧩 1. Primitive Data Types (8 Types)

| Type        | Size    | Default  | Example                     | Range/Info                      |
| ----------- | ------- | -------- | --------------------------- | ------------------------------- |
| **boolean** | ~1 byte | `false`  | `boolean isJavaFun = true;` | Only `true` or `false`          |
| **byte**    | 1 byte  | `0`      | `byte a = 25;`              | -128 to 127                     |
| **short**   | 2 bytes | `0`      | `short s = 1000;`           | -32,768 to 32,767               |
| **int**     | 4 bytes | `0`      | `int x = 100000;`           | -2,147,483,648 to 2,147,483,647 |
| **long**    | 8 bytes | `0L`     | `long pop = 7800000000L;`   | Huge integer range              |
| **float**   | 4 bytes | `0.0f`   | `float pi = 3.14f;`         | 6–7 decimal digits              |
| **double**  | 8 bytes | `0.0d`   | `double pi = 3.14159;`      | 15–16 decimal digits            |
| **char**    | 2 bytes | `\u0000` | `char ch = 'A';`            | Unicode (0–65535)               |

✅ **Note:**
Java uses **Unicode**, not ASCII — that’s why `char` takes **2 bytes** (to support all languages).

---

### 🔸 Example — Using All Primitive Types

```java
class DataTypesDemo {
    public static void main(String[] args) {
        boolean b = true;
        byte by = 10;
        short s = 200;
        int i = 1000;
        long l = 9999999L;
        float f = 3.14f;
        double d = 9.81;
        char c = 'A';

        System.out.println(b + " " + by + " " + s + " " + i + " " + l + " " + f + " " + d + " " + c);
    }
}
```

---

## 🧩 2. Non-Primitive (Reference) Data Types

These don’t store the actual value directly, but **store the memory address (reference)** of the object.

### 🧱 Examples

| Type          | Description                                   | Example                              |
| ------------- | --------------------------------------------- | ------------------------------------ |
| **String**    | Sequence of characters stored as an object.   | `String name = "Noman";`             |
| **Array**     | Collection of similar data types.             | `int[] num = {1, 2, 3};`             |
| **Class**     | Blueprint for creating objects.               | `class Car { String model; }`        |
| **Object**    | Instance of a class.                          | `Car myCar = new Car();`             |
| **Interface** | Contains abstract methods for implementation. | `interface Animal { void sound(); }` |

---

### 🧩 Example — Non-Primitive Types

```java
// String Example
String name = "Java";
System.out.println(name);

// Array Example
int[] numbers = {1, 2, 3};
System.out.println(numbers[0]);

// Class & Object Example
class Car {
    String model;
    int year;

    Car(String m, int y) {
        model = m;
        year = y;
    }
}
Car c = new Car("Toyota", 2024);
System.out.println(c.model + " " + c.year);
```

---

## ⚖️ Primitive vs Non-Primitive (Quick Comparison)

| Aspect         | Primitive              | Non-Primitive                           |
| -------------- | ---------------------- | --------------------------------------- |
| **Stored in**  | Stack memory           | Heap memory (reference stored in stack) |
| **Stores**     | Actual value           | Address (reference) of object           |
| **Speed**      | Faster                 | Slower                                  |
| **Created by** | Java language          | Programmer (class, array, string)       |
| **Examples**   | `int`, `char`, `float` | `String`, `Array`, `Class`              |

---

## 💾 Heap vs Stack Memory (Very Important for Interview)

| Concept          | Explanation                                                                 |
| ---------------- | --------------------------------------------------------------------------- |
| **Stack Memory** | Stores primitive values and references to objects. Fast and limited.        |
| **Heap Memory**  | Stores actual objects (like String, Arrays, Objects). Shared among threads. |

✅ **So in Java:**

* **Primitive types** (like `int`, `boolean`) → stored in **stack**.
* **Reference types** (like `String`, `Array`, `Object`) → **reference (address)** in stack, but **actual data/object** in **heap**.

---

## 🔍 Comparison with C and C++

| Concept               | Java                                   | C / C++                                                            |
| --------------------- | -------------------------------------- | ------------------------------------------------------------------ |
| **Strings**           | Stored in **heap** as objects          | Stored in **stack** or **static memory** as char arrays            |
| **Arrays**            | Always **objects**, stored in **heap** | Can be in **stack** (local) or **heap** (if dynamically allocated) |
| **Memory Management** | Automatic (via Garbage Collector)      | Manual (via `malloc`, `free`, or `new`, `delete`)                  |

---


# 🧠 **Type Conversion & Type Casting in Java**

Java is a **statically typed language**, meaning you must declare the type of a variable before using it.
Sometimes, we need to **convert one data type into another**, and that’s where **type conversion** and **type casting** come in.

---

## 🔹 **1. Type Conversion (Implicit / Widening Conversion)**

Also called **Automatic Type Conversion**, this happens **automatically** when:

✅ Data is converted **from a smaller size type → to a larger size type**
✅ There is **no loss of data**
✅ The types are **compatible** (numeric types)

---

### 🧩 **Example:**

```java
public class Example {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // int → double (automatic conversion)
        System.out.println(b);
    }
}
```

🖥️ **Output:**

```
10.0
```

Here, `int` (4 bytes) → `double` (8 bytes), done **automatically** by Java.

---

### 📘 **Widening Conversion Order (small → large):**

```
byte → short → int → long → float → double
           ↑
           char
```

✅ **Allowed:**

```java
byte b = 10;
int i = b;      // OK
float f = i;    // OK
double d = f;   // OK
```

❌ **Not Allowed (needs explicit cast):**

```java
int i = 100;
byte b = i; // Error - Possible loss of precision
```

---

## 🔸 **2. Type Casting (Explicit / Narrowing Conversion)**

Also called **Manual Type Conversion**, when you **forcefully convert** a **larger type → smaller type**.

You use the **cast operator `(type)`** before the value.

---

### 🧩 **Example:**

```java
public class Example {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d; // double → int (manual cast)
        System.out.println(i);
    }
}
```

🖥️ **Output:**

```
9
```

⚠️ **Note:** Decimal part (`.78`) is lost → **possible data loss**.

---

### 📘 **Narrowing Conversion Order (large → small):**

```
double → float → long → int → short → byte
```

---

### 🧮 **Example with Loss of Data:**

```java
int x = 130;
byte y = (byte) x; // int → byte
System.out.println(y);
```

🖥️ **Output:**

```
-126
```

⚠️ Why?
Because byte range is **-128 to 127**, so overflow causes **data loss**.

---

## ⚙️ **Difference Between Type Conversion and Type Casting**

| Feature      | Type Conversion (Implicit)     | Type Casting (Explicit)           |
| ------------ | ------------------------------ | --------------------------------- |
| Who performs | Done automatically by compiler | Done manually by programmer       |
| Direction    | Smaller → Larger (Widening)    | Larger → Smaller (Narrowing)      |
| Data loss    | No                             | Possible                          |
| Syntax       | No special syntax              | Uses `(type)`                     |
| Example      | `int a = 5; double b = a;`     | `double d = 9.8; int i = (int)d;` |

---

## 🧩 **Special Case: char and int**

```java
char ch = 'A';
int ascii = ch;        // char → int (automatic)
System.out.println(ascii); // 65

int num = 66;
char c = (char) num;   // int → char (manual)
System.out.println(c); // B
```

---

## ⚡ **Interview Tips & Key Points**

🔹 **Widening** is **safe**, **automatic**, and **does not lose data**.
🔹 **Narrowing** must be done **manually** — may cause **data loss or overflow**.
🔹 `boolean` cannot be converted to/from any other type.
🔹 Always remember the **conversion hierarchy** order.
🔹 In Java, **type casting** works only between **compatible data types**.

---

### 🧠 **Simple Way to Remember**

👉 **Small → Big = Automatic (Safe)**
👉 **Big → Small = Manual (Risky)**

---

✅ **Example Summary Table**

| From → To    | Conversion Type | Allowed Automatically? | Example              |
| ------------ | --------------- | ---------------------- | -------------------- |
| byte → int   | Widening        | ✅                      | `int i = b;`         |
| int → double | Widening        | ✅                      | `double d = i;`      |
| double → int | Narrowing       | ❌ (needs cast)         | `int i = (int)d;`    |
| int → byte   | Narrowing       | ❌ (needs cast)         | `byte b = (byte)i;`  |
| char → int   | Widening        | ✅                      | `int n = 'A';`       |
| int → char   | Narrowing       | ❌                      | `char c = (char)97;` |

---

````

