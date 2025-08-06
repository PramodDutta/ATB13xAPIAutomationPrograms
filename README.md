# ATB13x API Automation Framework 🚀

Welcome to the **ATB12x API Automation** repository!  
This project is designed to help you learn and master **REST API automation** using **Rest Assured** in Java, along with **TestNG**, **Allure Reports**, and **Apache POI** for data-driven testing.

---

## 📚 What You Will Learn

This repository covers hands-on implementation of:

- ✅ Basics of **Rest Assured**
- 📡 Performing **CRUD operations**:
    - `GET` – Retrieve resources
    - `POST` – Create new resources
    - `PUT` – Update existing resources
    - `PATCH` – Partial update of resources
    - `DELETE` – Remove resources
- 🧪 Integrating with **TestNG** for test structuring
- 📊 Generating rich test reports using **Allure**
- 📂 Performing **Data-Driven Testing** using **Apache POI** to read from Excel

---

## 🛠️ Technologies Used

| Technology     | Purpose                        |
|----------------|--------------------------------|
| Java           | Programming Language           |
| Rest Assured   | API Testing Framework          |
| TestNG         | Test Runner and Assertions     |
| Allure         | Reporting Tool                 |
| Apache POI     | Data-Driven Testing with Excel |
| Maven          | Project Build Tool             |
| IntelliJ IDEA  | IDE                            |

---

## 📁 Project Structure

```bash
ATB12x-API-Automation/
│
├── src/test/java/
│   ├── base/                 # Base test setup
│   ├── crud/                 # CRUD test cases
│   ├── utils/                # Utility functions (Excel, Config, etc.)
│   └── tests/                # TestNG test classes
│
├── testng.xml                # TestNG suite file
├── pom.xml                   # Maven dependencies
└── README.md                 # Project documentation
