# Pundar: Retirement Investment Planning System with MySQL Database Integration

## Project Overview

This project is a Java application that integrates with a MySQL database to store and manage user data. The application implements key features such as user registration, and retirement planning. The MySQL database is used to persist data and facilitate CRUD (Create, Read, Update, Delete) operations for the application.

## Features

- **User Management**: Allows users to sign up, log in, and update their information.
- **Data Management**: Stores user data in a MySQL database, including tables `users`, `plans`, etc..
- **CRUD Operations**: The application supports basic CRUD operations to manage user data and other information related to the app.

## Database Integration

This project uses MySQL as the backend database. The database is integrated using JDBC (Java Database Connectivity) to establish a connection between the Java application and MySQL. The `DatabaseConnection` class handles the connection setup, and the application interacts with the database to store and retrieve data.

### Database Structure

The database schema consists of multiple tables to store data related to the application's features. The schema includes relationships between tables, such as [mention key relationships, e.g., a `User` table related to a `RetirementPlan` table].

