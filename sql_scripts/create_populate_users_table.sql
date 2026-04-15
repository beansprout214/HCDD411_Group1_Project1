USE jupiter_employee_db; 

CREATE TABLE users ( 
	username VARCHAR(50) NOT NULL PRIMARY KEY, 
	password VARCHAR(100) NOT NULL, 
	enabled TINYINT(1) NOT NULL 
); 

INSERT INTO users (username, password, enabled) VALUES 
('john', '{noop}test123', 1), 
('mary', '{noop}test123', 1), 
('susan', '{noop}test123', 1); 