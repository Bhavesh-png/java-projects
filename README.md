# ☕ Java Projects Repository

Welcome to the **Java Projects Repository**! This repository is a comprehensive collection of Java programs, ranging from fundamental core concepts to advanced enterprise-level applications. It is designed for learning, academic purposes, and as a reference for implementing various Java technologies.

---

## 📂 What Does This Folder Contain?

This repository is structured into multiple sub-projects, each focusing on a specific Java technology or concept:

- **`Collection_Classes_1/`**: Implementation of Java Collections Framework (Lists, Sets, Maps, etc.) to manage and manipulate groups of objects.
- **`College-Time-Table-System/`**: A fully functional desktop application for managing college timetables. Features a modern FlatLaf UI, SQLite database integration, and Maven build system.
- **`EJB/` (Enterprise JavaBeans)**: Examples demonstrating enterprise-level architecture, business logic components, and server-side model implementations.
- **`JDBC_Program/`**: Java Database Connectivity examples showing how to connect, query, and manipulate relational databases using Java.
- **`Java_Bean/`**: Demonstrations of JavaBeans components — reusable software components that follow specific naming conventions.
- **`Multi_Threading/`**: Programs exploring Java's multithreading capabilities including thread creation, synchronization, and concurrent execution.
- **`RMI_Technology/` (Remote Method Invocation)**: Examples of distributed applications using RMI to allow Java objects running on one JVM to invoke methods on an object running on another JVM.
- **`Servlet-JSP-and-JDBC/`**: Web application examples built using Java Servlets, JavaServer Pages (JSP), and JDBC for dynamic web development and database interaction.
- **`Socket_Program/`**: Networking examples in Java showing both TCP and UDP socket programming for client-server communication.

---

## 🤔 Why Use This Repository?

- **Educational Resource**: It serves as a practical, hands-on guide for learning Core and Advanced Java.
- **Reference Code**: Provides ready-to-run templates and snippets for common Java patterns (e.g., database connections, threading logic).
- **Project Inspiration**: Contains full projects (like the `College-Time-Table-System`) that can be used to understand application architecture, UI design in Swing (FlatLaf), and database management.
- **Preparation for Academics/Interviews**: Covers many topics heavily tested in computer science curricula and coding interviews.

---

## 🛠️ How to Use It?

Most of the projects in this repository are managed using **Maven** (`pom.xml` files). 

### Prerequisites
- **JDK** (Java Development Kit) 17 or higher installed.
- **Apache Maven** installed.
- A Java IDE (like IntelliJ IDEA, Eclipse, or VS Code with Java extensions).

### Steps to Run a Project

1. **Clone the repository:**
   ```bash
   git clone <repository_url>
   cd "Java Projects"
   ```

2. **Navigate to the desired project directory:**
   For example, to run the College Time Table System:
   ```bash
   cd College-Time-Table-System
   ```

3. **Build the project using Maven:**
   ```bash
   mvn clean install
   ```
   *This command will download the necessary dependencies (like database drivers or UI themes) specified in the `pom.xml`.*

4. **Run the project:**
   - **For Executable Applications:** If it's a Maven project configured with a main class (like the College Time Table System), you can run the shaded JAR:
     ```bash
     java -jar target/College-Time-Table-System-1.0-SNAPSHOT.jar
     ```
   - **For Web Projects (Servlets/JSP):** Deploy the generated `.war` file to a Java web server like Apache Tomcat.
   - **For Simple Java Programs:** You can run them directly through your IDE or by compiling and running the `.java` files from the terminal:
     ```bash
     javac "path\to\YourClass.java"
     java YourClass
     ```
