# Employee Management System 🚀

A simple **Employee Management System** implemented in Java using **Encapsulation and Inheritance**. This system allows you to manage employees, including **Full-time** and **Part-time** employees, while maintaining an organized and scalable code structure.

---

## 📌 Features

✅ Object-Oriented Programming (OOP) with **Encapsulation and Inheritance**  
✅ **Full-time & Part-time Employee** management  
✅ **Add, Remove, and Display** employees  
✅ Uses **Polymorphism** for flexible method overriding  
✅ **Scalable** design with separate files for each class  

---

## 🏗️ Project Structure

EmployeeManagementSystem/ │── src/ │ ├── Employee.java # Base class (Encapsulation) │ ├── FullTimeEmployee.java # Inherits from Employee │ ├── PartTimeEmployee.java # Inherits from Employee │ ├── Company.java # Manages employees │ ├── Main.java # Runs the program │── README.md # Project documentation │── .gitignore # Ignore compiled files │── EmployeeManagementSystem.iml # IntelliJ project file (optional)

---

## 🛠️ Installation & Setup

### **🔹 1. Clone the Repository**

```sh
git clone https://github.com/yourusername/EmployeeManagementSystem.git
cd EmployeeManagementSystem
```

### **🔹 2. Compile the Program**

```sh
javac -d out src/*.java
```

### **🔹 3. Run the Program**

```sh
java -cp out src.Main
```

---

### 🖥️ Usage Example

```java
FullTimeEmployee emp1 = new FullTimeEmployee(1, "Alice Johnson", "Engineering", 80000, 5000);
PartTimeEmployee emp2 = new PartTimeEmployee(2, "Bob Smith", "Marketing", 25, 20);

myCompany.addEmployee(emp1);
myCompany.addEmployee(emp2);

myCompany.displayEmployees();

myCompany.removeEmployee(2);

myCompany.displayEmployees();
```

### Sample Output

```yaml
Employee added: Alice Johnson
Employee added: Bob Smith

--- Employee List ---
ID: 1, Name: Alice Johnson, Department: Engineering, Salary: $80000.0
Annual Bonus: $5000.0
-------------------
ID: 2, Name: Bob Smith, Department: Marketing, Salary: $500.0
Hourly Rate: $25.0, Hours Worked: 20
-------------------

Employee with ID 2 removed.

--- Employee List ---
ID: 1, Name: Alice Johnson, Department: Engineering, Salary: $80000.0
Annual Bonus: $5000.0
-------------------

```

### 🔥 Future Enhancements

```text
 Add Interns and Contract Employees
 Implement Database integration (MySQL/PostgreSQL)
 Add User Input for dynamic employee management
 Create a GUI interface using JavaFX or Swing
 Implement Unit Testing using JUnit
 ```

---

### 🤝 Contributing

Feel free to fork this repository and contribute! If you have suggestions or improvements, submit a pull request. 🚀

---

## 📝 License

This project is open-source and free to use. No license required.

## 🔗 Connect with Me

- [GitHub](https://github.com/aimaovai)
- [LinkedIn](https://www.linkedin.com/in/aimaovai)
- [MyWebsite](https://aima-ovai-portfolio.vercel.app/)
