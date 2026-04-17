CREATE DATABASE IF NOT EXISTS jupiter_employee_db;

USE jupiter_employee_db; 

DROP TABLE IF EXISTS `employee_record`;

CREATE TABLE employee_record ( 
    employee_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
    first_name VARCHAR(50) NOT NULL, 
    last_name VARCHAR(50) NOT NULL, 
    start_date DATE NOT NULL, 
    start_salary DECIMAL(10,2) NOT NULL, 
    contract_signed ENUM('Y','N') NOT NULL, 
    ssn VARCHAR(11) NOT NULL UNIQUE, 
    birthdate DATE NOT NULL, 
    phone_number VARCHAR(20), 
    emergency_contact_name VARCHAR(100), 
    emergency_contact_phone VARCHAR(20) 
);

INSERT INTO employee_record  
(first_name, last_name, start_date, start_salary, contract_signed, ssn, birthdate, phone_number, emergency_contact_name, emergency_contact_phone) 
VALUES 
('Stefan', 'Salvatore', '1997-11-17', 50000.00, 'Y', '123-45-6789', '1975-03-12', '555-111-2222', 'Elena Gilbert', '555-333-4444'), 
('Diana', 'Lorrence', '2000-05-01', 70000.00, 'Y', '987-65-4321', '1980-09-22', '555-222-3333', 'Mark Lorrence', '555-444-5555'), 
('James', 'Madinson', '1988-06-19', 80400.00, 'Y', '111-22-3333', '1965-01-05', '555-333-4444', 'Sarah Madinson', '555-666-7777'), 
('Jones', 'Nick', '2003-01-02', 47000.00, 'N', '222-33-4444', '1985-07-18', '555-444-5555', 'Tom Nick', '555-777-8888'), 
('Lucy', 'Geller', '2008-07-13', 35000.00, 'Y', '333-44-5555', '1990-11-30', '555-555-6666', 'Monica Geller', '555-888-9999');

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