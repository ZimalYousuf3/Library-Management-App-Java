# 📚 Library Management App — Java Swing

A simple desktop application built with **Java Swing** that calculates library fines for different member types. This project demonstrates core **Object-Oriented Programming (OOP)** principles including Inheritance, Polymorphism, Encapsulation, and Abstraction.

---

## 🖥️ Features

- Enter member name and number of books borrowed
- Select member type: **Student**, **Teacher**, or **Guest**
- Automatically calculates fine based on member type
- Clean GUI built with Java Swing

---

## 💰 Fine Structure

| Member Type | Fine Per Book |
|-------------|--------------|
| Student     | PKR 50       |
| Teacher     | PKR 30       |
| Guest       | PKR 100      |

---

## 🏗️ Project Structure
---

## 🔑 OOP Concepts Used

- **Encapsulation** — Member data is wrapped inside the `Member` class
- **Inheritance** — `StudentMember`, `TeacherMember`, and `GuestMember` extend `Member`
- **Polymorphism** — Each subclass overrides `calculateFine()` differently
- **Abstraction** — `LibraryService` interface defines the contract

---

## 🚀 How to Run

1. Clone the repository
```bash
   git clone https://github.com/ZimalYousuf3/Library-Management-App-Java.git
```
2. Open the project in **Eclipse IDE**
3. Run `LibraryApp.java` as a Java Application

---

## 🛠️ Built With

- Java
- Java Swing (GUI)
- Eclipse IDE

---

## 👤 Author

**Zimal Yousuf**  
BSCS Student | C++ Programmer  
*Passionate about clean code and foundational programming concepts*

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
