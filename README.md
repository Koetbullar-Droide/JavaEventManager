# Eventmanager

A school project designed to learn and apply fundamental and advanced Java concepts.

## 📚 Project Overview

The **Eventmanager** is a console-based application that facilitates event management and user registration. Developed in an educational setting, this project emphasizes the practical application of key Java concepts while meeting specific learning goals and requirements.

---

## 🎯 Learning Goals & Requirements

This project covers the following topics and objectives:

1. **Core Java Topics**:
    - **Inheritance**: Sharing common attributes and methods among event types.
    - **Polymorphism**: Using method overriding and overloading, e.g., `calculateCost()` in event types.
    - **Interfaces**: Implementing `Notifiable` to demonstrate interface usage.
    - **Abstract Classes**: Leveraging the `Event` abstract class for extensibility.
    - **Composition and Aggregation**: Structuring relationships between objects like events, users, and their dependencies.
    - **Exception Handling**: Handling errors gracefully with custom exceptions (`EventNotFoundException`, `InvalidDateException`, etc.).

2. **Documentation**:
    - **JavaDoc**: Comprehensive documentation using annotations such as `@author`, `@version`, `@param`, `@return`, and `@throws`.
    - **Class Diagrams**: Includes a UML diagram that accurately represents constructors, methods, and variables.

3. **Testing**:
    - **JUnit Tests**: Includes meaningful unit tests, targeting a test coverage of approximately 50-60%.

4. **Demonstration & Presentation**:
    - The project is presented to the teacher in a 5-minute session, explaining the purpose, structure, and implementation details.
    - The theme is chosen by the student and preferably relates to their personal interests.

---
## 📈UML Diagram
![uml.png](uml.png)

---

## 🛠️ Features

- **Event Management**:
    - Add, search, and list events (e.g., Concerts, Workshops, Conferences).
    - Polymorphic behavior across event types for cost calculation and details display.

- **User Management**:
    - Register users and assign them to events.
    - List all users or those associated with a specific event.

- **Core Concepts Demonstrations**:
    - Object-oriented principles like inheritance, interfaces, and abstraction.
    - Error handling with custom exceptions.
    - Composition and aggregation for object relationships.

---

## 🚀 Running the Project

### Prerequisites

- **Java 20** or higher
- **Maven** (for dependency management and builds)
- An IDE like IntelliJ IDEA (recommended) or Eclipse

### Setting Up the Project

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Koetbullar-Droide/JavaEventManager.git
   cd Eventmanager
   ```

2. **Install dependencies**:
   Use Maven to download the required dependencies:
   ```bash
   mvn clean install
   ```

3. **Run the application**:
   Start the `EventManagerApp` class from your IDE or run it from the terminal:
   ```bash
   mvn exec:java -Dexec.mainClass="org.example.Main"
   ```

---

## 🧪 Running Tests

The project uses **JUnit 5** for unit testing to ensure core functionalities work as expected.

1. **Run tests**:
   ```bash
   mvn test
   ```

2. **Add new tests**:
   Create new test classes in the `src/test/java/org/example` directory.

---

## 🌟 How to Extend

### Adding New Features

1. **Add a new event type**:
    - Extend the abstract `Event` class.
    - Implement the `calculateCost()` method and any unique functionality.

2. **Improve User Interaction**:
    - Add more user-friendly features, like searching users or events interactively.

3. **Enhance with GUI**:
    - Optionally add a graphical user interface (e.g., with JavaFX) for better usability.

4. **Database Integration**:
    - Add persistence with a database like SQLite for permanent storage of events and users.

---

## 📝 Requirements Checklist

### Project-Independent Topics
- **JavaDoc**: Complete documentation with key annotations like `@author`, `@version`, `@param`.
- **Unit Tests**: Includes meaningful tests covering at least 50-60% of the code.
- **Class Diagram**: An up-to-date UML diagram generated from IntelliJ.

### Project-Dependent Topics
- **Inheritance**: Shared logic across multiple event types.
- **Composition & Aggregation**: Logical relationships between objects.
- **Polymorphism**: Overriding methods (e.g., `displayDetails`) for dynamic behavior.
- **Interfaces**: Implementation of the `Schedulable` and `Notifiable` interfaces.
- **Abstract Classes**: The `Event` class provides a base for specific event types.
- **Overloading & Overriding**: Demonstrated across methods and constructors.
- **Exception Handling**: Custom exceptions for robust error management.

### Core Java Elements
- **Constructors**: Used effectively across all classes.
- **Variables & Methods**: Proper encapsulation and functionality across classes.
- **Execution**: The code is designed to run and demonstrate all required features.

---

## 👨‍💻 Author

- **Jannik Lüthi** - Student, Aspiring Java Developer

---

## 📜 License

This project was developed as part of a school assignment and is intended for educational purposes only.

---
