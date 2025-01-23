# Eventmanager

A school project designed to learn and apply fundamental and advanced Java concepts.

## 📚 Project Overview

The **Eventmanager** is a console-based application that enables event management and user registration. This project was developed in an educational context to learn and practice the following Java concepts:

- **Inheritance**: Sharing common attributes and methods among different event types (e.g., concerts, workshops, conferences).
- **Polymorphism**: Using the abstract method `calculateCost()` for diverse event types.
- **Interfaces**: Implementing the `Notifiable` interface for notifications.
- **Exceptions**: Handling custom exceptions like `EventNotFoundException` and `UserAlreadyRegisteredException`.
- **Data Structures**: Using lists to store events and users.

---

## 🎯 Purpose of the Project

The goal of this project is to build a functional Java program that implements the principles of object-oriented programming (OOP). Additionally, it provides a practical application for these concepts by managing events and users.

---

## 🛠️ Features

- **Event Management**:
  - Add new events.
  - List all available events.
  - Search for specific events.

- **User Management**:
  - Register and manage users.
  - Add users to events.
  - View all registered users.
  - Display users registered for a specific event.

- **Java Concept Demonstrations**:
  - Inheritance and polymorphism for event types.
  - Custom exceptions for error handling.
  - Interfaces for notification functionality.

---

## 🚀 Running the Project

### Prerequisites

- **Java 20** or higher
- **Maven** (for dependency management and builds)
- An IDE like IntelliJ IDEA (recommended) or Eclipse

### Setting Up the Project

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
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
   mvn exec:java -Dexec.mainClass="org.example.EventManagerApp"
   ```

---

## 🧪 Running Tests

The project uses **JUnit 5** for unit testing to ensure the core functionalities work as expected.

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
   - Create a new class that extends the abstract class `Event`.
   - Implement the `calculateCost()` method for specific cost calculations for your new event type.

2. **Create a graphical user interface (optional)**:
   - Enhance the application with JavaFX or another GUI library to provide a user-friendly interface.

3. **Add persistence**:
   - Integrate a database like SQLite to store events and users permanently.

### Coding Guidelines

- Follow **Clean Code** principles.
- Use **JavaDocs** to document your code.
- Write unit tests for all new features.

---

## 👨‍💻 Authors

- **Jannik Lüthi** - Student, Aspiring Java Developer

---

## 📜 License

This project was developed as part of a school assignment and is intended for educational purposes only.

---
