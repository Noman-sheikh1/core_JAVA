

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



````

