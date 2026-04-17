CREATE DATABASE IF NOT EXISTS jupiter_employee_db;

USE `jupiter_employee_db`;

DROP TABLE IF EXISTS `roles`;
DROP TABLE IF EXISTS `users`;

CREATE TABLE users ( 
    username VARCHAR(50) NOT NULL PRIMARY KEY, 
    password VARCHAR(100) NOT NULL, 
    enabled TINYINT(1) NOT NULL 
); 

CREATE TABLE roles ( 
    user_id VARCHAR(50) NOT NULL, 
    role VARCHAR(50) NOT NULL, 
    FOREIGN KEY (user_id) REFERENCES users(username) 
);


INSERT INTO users (username, password, enabled) VALUES 
('john', '{bcrypt}$2a$10$zYhwbceX.1ADGbuzMQEfLeOxaSvBKdrWRhmIXVwPXw.33CF2jjiZm', 1), 
('mary', '{bcrypt}$2a$10$zYhwbceX.1ADGbuzMQEfLeOxaSvBKdrWRhmIXVwPXw.33CF2jjiZm', 1), 
('susan', '{bcrypt}$2a$10$zYhwbceX.1ADGbuzMQEfLeOxaSvBKdrWRhmIXVwPXw.33CF2jjiZm', 1);


INSERT INTO roles (user_id, role) VALUES 
('john', 'ROLE_EMPLOYEE'), 
('mary', 'ROLE_EMPLOYEE'), 
('mary', 'ROLE_MANAGER'), 
('susan', 'ROLE_ADMIN'), 
('susan', 'ROLE_EMPLOYEE'), 
('susan', 'ROLE_MANAGER'); 