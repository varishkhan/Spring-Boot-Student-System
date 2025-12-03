# 🚀 Intelligent Student Management API

An **Enterprise-Grade RESTful API** built with **Spring Boot** and **MySQL**. This backend system automates student record management, featuring optimized data retrieval queries and a scalable Layered Architecture (Controller-Service-Repository).

---

## 🌟 Key Features

* **RESTful Architecture:** Fully compliant `GET`, `POST`, and `DELETE` endpoints for managing student data.
* **Layered Design:** Implements industry-standard **Separation of Concerns** using Service and Repository layers.
* **Optimized Performance:** Utilizes Custom JPQL queries to minimize database fetch latency.
* **Data Validation:** Includes business logic to prevent duplicate email registrations.
* **Automated Schema:** Uses **Hibernate/JPA** to automatically generate and update database tables.

---

## 🛠️ Tech Stack

* **Framework:** Spring Boot 3.x (Spring Web, Spring Data JPA)
* **Language:** Java 17
* **Database:** MySQL (Compatible with XAMPP)
* **Build Tool:** Maven
* **Testing:** Postman / Thunder Client

---

## ⚙️ Installation & Setup

Follow these steps to run the project locally.

### 1. Prerequisites
* Java JDK 17 or higher
* MySQL (via XAMPP or Workbench)
* VS Code or IntelliJ IDEA

### 2. Configure Database
1.  Open **XAMPP** and start **Apache** and **MySQL**.
2.  Go to `http://localhost/phpmyadmin`.
3.  Create a new database named: **`student_db`**

### 3. Configure Application
Open `src/main/resources/application.properties` and update your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=  <-- PUT YOUR PASSWORD HERE (Leave empty for XAMPP default)
spring.jpa.hibernate.ddl-auto=update