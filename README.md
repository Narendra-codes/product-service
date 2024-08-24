Product Service using Spring Boot
This repository contains a Spring Boot application that provides a product service, allowing users to create and retrieve products. The application uses Spring JPA for database operations and PostgreSQL as the database management system.

Features
Create a new product using the POST /api/service/product/create endpoint
Retrieve all products using the GET /api/service/product/get endpoint
Unique product IDs are generated using UUID
Technical Details
The application uses Spring Boot 3.3.3 as the framework
Spring JPA is used for database operations, providing a layer of abstraction between the application and the database
PostgreSQL is used as the database management system
Testcontainers is used for testing the application, providing a lightweight and efficient way to spin up and down test databases
API Endpoints:
Create Product:
Endpoint: POST /api/service/product/create
Request Body: Product object with the following properties:
name: String
description: String
price: BigDecimal
Response: 201 Created with the newly created product's ID
Find All Products:
Endpoint: GET /api/service/product/get
Response: 200 OK with a list of all products
Testing
The application uses Testcontainers to test the database operations. The tests are written using JUnit and can be found in the src/test/java directory.
