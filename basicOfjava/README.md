

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

