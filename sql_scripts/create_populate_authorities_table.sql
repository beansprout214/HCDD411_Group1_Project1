USE jupiter_employee_db; 

CREATE TABLE authorities ( 
	user_id VARCHAR(50) NOT NULL, 
	role VARCHAR(50) NOT NULL, 
	FOREIGN KEY (user_id) REFERENCES users(username) 
); 

INSERT INTO authorities (user_id, role) VALUES 
('john', 'ROLE_EMPLOYEE'), 
('mary', 'ROLE_EMPLOYEE'), 
('mary', 'ROLE_MANAGER'), 
('susan', 'ROLE_ADMIN'), 
('susan', 'ROLE_EMPLOYEE'), 
('susan', 'ROLE_MANAGER'); 