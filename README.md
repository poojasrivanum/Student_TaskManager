# Task Management REST API

A professional backend REST API project built using Java 21, Spring Boot, Spring Data JPA, MySQL, Maven, and Postman.

This project demonstrates real-world backend development concepts including layered architecture, CRUD operations, RESTful APIs, database integration, and API testing.

---

# Features

- Create Task
- Get All Tasks
- Update Existing Task
- Delete Task
- Bulk Insert Tasks
- MySQL Database Integration
- REST API Architecture
- Layered Backend Design
- Swagger API Documentation

---

# Technologies Used

| Technology | Purpose |
|---|---|
| Java 21 | Core Programming Language |
| Spring Boot | Backend Framework |
| Spring Data JPA | Database ORM Layer |
| MySQL | Relational Database |
| Maven | Dependency Management |
| Postman | API Testing |
| Swagger/OpenAPI | API Documentation |

---

# Project Architecture

The project follows layered architecture:

Client → Controller → Service → Repository → Database

## Layers

### Controller Layer
Handles HTTP requests and responses.

### Service Layer
Contains business logic and processing.

### Repository Layer
Communicates with the database using JPA.

### Model Layer
Represents database entities.

---

# Project Structure

```text
taskManager
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com/pooja/taskManager
│   │   │
│   │   │   ├── controller
│   │   │   ├── service
│   │   │   ├── repository
│   │   │   ├── model
│   │   │   └── TaskManagerApplication.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│
├── pom.xml
└── README.md
```

---

# API Endpoints

## Base URL

```text
http://localhost:8080/api/tasks
```

---

# 1. Create Single Task

## Endpoint

```http
POST /api/tasks
```

## Request Body

```json
{
    "title": "Learn Spring Boot",
    "description": "Practice REST APIs",
    "status": "PENDING"
}
```

## Response

```json
{
    "id": 1,
    "title": "Learn Spring Boot",
    "description": "Practice REST APIs",
    "status": "PENDING"
}
```

---

# 2. Create Multiple Tasks

## Endpoint

```http
POST /api/tasks/bulk
```

## Request Body

```json
[
    {
        "title": "Learn Spring Boot",
        "description": "Practice CRUD APIs",
        "status": "PENDING"
    },
    {
        "title": "Build Portfolio Project",
        "description": "Create internship-level project",
        "status": "IN_PROGRESS"
    }
]
```

---

# 3. Get All Tasks

## Endpoint

```http
GET /api/tasks
```

## Response

```json
[
    {
        "id": 1,
        "title": "Learn Spring Boot",
        "description": "Practice CRUD APIs",
        "status": "PENDING"
    }
]
```

---

# 4. Update Task

## Endpoint

```http
PUT /api/tasks/{id}
```

## Request Body

```json
{
    "title": "Learn Spring Boot Advanced",
    "description": "Practice advanced REST APIs",
    "status": "COMPLETED"
}
```

---

# 5. Delete Task

## Endpoint

```http
DELETE /api/tasks/{id}
```

---

# MySQL Database Setup

## Create Database

Run this query in MySQL Workbench:

```sql
CREATE DATABASE task_management_db;
```

---

# Configure application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/task_management_db
spring.datasource.username=root
spring.datasource.password=root123

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# Run The Project

## Clone Repository

```bash
git clone https://github.com/yourusername/task-manager-api.git
```

## Navigate To Project

```bash
cd task-manager-api
```

## Run Application

```bash
mvn spring-boot:run
```

---

# Swagger API Documentation

After running the project:

```text
http://localhost:8080/swagger-ui/index.html
```

For deployed version:

```text
https://your-deployed-url/swagger-ui/index.html
```

---

# Testing Using Postman

1. Open Postman
2. Select HTTP Method
3. Enter API URL
4. Select Body → raw → JSON
5. Send Request

---

# Key Concepts Learned

- REST API Development
- CRUD Operations
- Layered Architecture
- Dependency Injection
- Spring Boot Annotations
- Spring Data JPA
- Hibernate ORM
- MySQL Integration
- API Testing
- Maven Dependency Management

---

# Future Improvements

- Validation using @Valid
- Global Exception Handling
- JWT Authentication
- Role-Based Authorization
- Pagination and Sorting
- Docker Deployment
- AWS Deployment
- React Frontend Integration

---

# Resume Description

Developed a Task Management REST API using Java 21, Spring Boot, Spring Data JPA, MySQL, Maven, and Postman. Implemented CRUD operations using layered architecture with Controller, Service, Repository, and Model layers. Integrated MySQL database and tested REST APIs using Postman and Swagger.

---

# Author

Pooja

---

# License

This project is developed for learning and portfolio purposes.
