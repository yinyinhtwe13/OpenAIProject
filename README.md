# 🍹 Juice Recipes REST API (OpenAIProject)
A containerized Spring Boot RESTful backend service for managing, querying, and adding custom juice recipes. Built with **Spring Data JPA**, **Jakarta Persistence**, and a containerized **PostgreSQL** database.

## 📖 Project Overview
This backend system provides a full set of RESTful APIs to handle juice recipe management. It uses **Jakarta Persistence (JPA)** for Object-Relational Mapping (ORM) and persists data into a **PostgreSQL** database instance managed via **Docker Compose**.

## 🛠️ Tech Stack & Key Tools
- **Language**: Java
- **Framework**: Spring Boot (Spring Web, Spring Data JPA)
- **Persistence**: Jakarta Persistence (`@Entity`, `@Id`, `@GeneratedValue`)
- **Database**: PostgreSQL (Containerized)
- **Containerization**: Docker & Docker Compose
- **Configuration**: Dynamic System Timezone (`Asia/Yangon`) setup via `@PostConstruct`
- **Testing**: IntelliJ Native HTTP Client (`request.http`)

## 🌟 Key Features
- **Data Persistence**: Maps `JuiceRecipes` entity (`id`, `name`, `ingredient`) to PostgreSQL database tables using JPA.
- **Dockerized Environment**: Spawns a dedicated PostgreSQL container (`postgres-spring-boot`) configured on mapped port `5332`.
- **Clean Architecture**: Follows the classic Controller-Service-Repository multi-layer architecture.
- **API Endpoint Suite**: Full support for listing all recipes, querying by ID, and adding new recipe items.

## 🚀 Getting Started

### 1. Prerequisites
- **JDK**: Java 17 or higher
- **Docker Desktop**: Installed and running
- **IDE**: IntelliJ IDEA (Recommended) or Eclipse
### 2. Launch PostgreSQL Container
Start the PostgreSQL database service using Docker Compose:
```bash
docker compose up -d
```
## 3. Run the Spring Boot Application
The application will launch on [!http://localhost:8080]

## 📡 API Endpoints
Base URL: http://localhost:8080/api/v1/juice-recipes
|Method| Endpoint                |	Description|
| :--- | :--- | :--- |
|`GET` 	|  `/`                         |	Hello World sanity test (Hello World Spring Boot)|
|`GET`  | `api/v1/juice-recipes`   	| Fetch all juice recipes|
|`GET`	  | `api/v1/juice-recipes/{id}`	| Fetch a specific juice recipe by ID|
|`POST` | `api/v1/juice-recipes`      | 	Add a new juice recipe|

## HTTP Request Examples (`request.http`)
### 1. Get All Recipes: GET http://localhost:8080/api/v1/juice-recipes
### 2. Get Recipe by ID : GET http://localhost:8080/api/v1/juice-recipes/1
### 3. Create a New Recipe (POST)
Header:
Content-Type: application/json
Payload Examples:
{
  "name": "Celery Juice",
  "ingredient": "Celery, Green apple, Lemon, Ginger"
}
