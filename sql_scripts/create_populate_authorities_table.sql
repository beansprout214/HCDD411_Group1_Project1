USE jupiter_employee_db; 

CREATE TABLE authorities ( 
    username VARCHAR(50) NOT NULL, 
    authority VARCHAR(50) NOT NULL, 
    FOREIGN KEY (username) REFERENCES users(username) 
); 

INSERT INTO authorities (username, authority) VALUES 
('john', 'ROLE_EMPLOYEE'), 
('mary', 'ROLE_EMPLOYEE'), 
('mary', 'ROLE_MANAGER'), 
('susan', 'ROLE_ADMIN'), 
('susan', 'ROLE_EMPLOYEE'), 
('susan', 'ROLE_MANAGER'); 