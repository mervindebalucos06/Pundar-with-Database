
CREATE DATABASE IF NOT EXISTS Pundar_System;
USE Pundar_system;


DROP TABLE IF EXISTS retirement_plans;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Create the 'retirement_plans' table
CREATE TABLE retirement_plans (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    current_savings DECIMAL(15, 2) NOT NULL,
    annual_contribution DECIMAL(15, 2) NOT NULL,
    retirement_age INT NOT NULL,
    investment_type ENUM('Conservative', 'Aggressive') NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);

-- Insert initial data into 'users' table
INSERT INTO users (name, password, age) VALUES
('John Doe', 'password123', 30),
('Jane Smith', 'securepass456', 25);

-- Insert initial data into 'retirement_plans' table
INSERT INTO retirement_plans (user_id, current_savings, annual_contribution, retirement_age, investment_type) VALUES
(1, 10000.00, 2000.00, 65, 'Conservative'),
(2, 5000.00, 1500.00, 60, 'Aggressive');

-- Display success message
SELECT 'Database and tables have been initialized successfully!' AS message;
