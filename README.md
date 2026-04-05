# ☕ Java Projects Collection

Welcome to the **Java Projects Collection**! This repository is a comprehensive portfolio of Java programs, ranging from fundamental core concepts to advanced enterprise-level web applications. It serves as an excellent resource for learning, academic coursework, and as a reference guide for various Java technologies.

---

## 📂 Project Directory Structure

This repository is structured into multiple independent projects, each focusing on a specific Java technology or framework:

### 🌐 Web & Enterprise Applications
- **`ServletApp/`** *(New)*: A straightforward Java Web Application demonstrating HTTP request and response handling using standard Java Servlets. Configured as a Maven Web App to run instantly in an IDE.
- **`JSPApp/`** *(New)*: An interactive web application showcasing how to blend Java code seamlessly inside HTML templates using JavaServer Pages (JSP).
- **`Servlet-JSP-and-JDBC/`**: Full-fledged web applications combining Servlets, JSP, and real-time database interaction over JDBC.
- **`JDBC_Program/`**: Comprehensive Java Database Connectivity examples demonstrating how to securely connect, query, and manipulate MySQL/Relational databases.
- **`EJB/` (Enterprise JavaBeans)**: Advanced examples exploring enterprise-layer architecture, robust business logic implementations, and robust server-side models.

### 💻 Desktop & Core Applications
- **`Java_Bean/`**: Implementations detailing the structure and strict conventions of reusable Java Bean software components.
- **`Collection_Classes_1/`**: A deep dive into the Java Collections Framework, manipulating data arrays through Lists, Sets, and Map integrations.
- **`Multi_Threading/`**: Practical implementations of Java's concurrent execution engine including programmatic thread safety and synchronization locks.
- **`RMI_Technology/` (Remote Method Invocation)**: Examples of distributed architecture where Java objects communicate and invoke remote methods across varying network JVM instances.
- **`Socket_Program/`**: Fundamental low-level network communication utilizing TCP/UDP Socket programming to build responsive client-server applications.

---

## 🛠️ Setup & Execution

The majority of these projects are actively configured using the **Maven** build system (`pom.xml`) for seamless dependency management and first-class IDE compatibility. 

### Prerequisites
- **Java Development Kit:** JDK 17 or JDK 21 is highly recommended to comply with the latest standards.
- **IDE:** Apache **NetBeans** (Extremely optimal for Servlet/JSP web targets), IntelliJ IDEA, or Eclipse.
- **Servers:** Local background instances of **Apache Tomcat** (for running web apps) and **MySQL / XAMPP** (for Database projects).

### 🚀 Running the Projects (NetBeans / IDE Method)
The fastest and safest way to explore the applications:
1. Open up **NetBeans**.
2. Select **File -> Open Project...**
3. Navigate to this main repository and select the specific project subfolder you wish to examine (e.g., `JSPApp`).
4. Wait a few moments for dependencies to load, then click the **Run Project** button. The IDE natively manages compilation, Tomcat/GlassFish server spin-ups, and browser deployment!

### 📟 Running the Projects (Terminal / Command Line Method)
For a raw developer workflow leveraging standard command tools:
1. Open your terminal and walk into a project directory:
   ```bash
   cd "ServletApp"
   ```
2. Build the Maven structure from scratch:
   ```bash
   mvn clean package
   ```
3. **For Desktop Tools (.jar)**: 
   ```bash
   java -jar target/app-name-1.0-SNAPSHOT.jar
   ```
4. **For Web Tools (.war)**: Drag and drop the compiled `.war` file physically from inside `target/` into your Apache Tomcat `webapps/` folder, then boot your Tomcat server.
