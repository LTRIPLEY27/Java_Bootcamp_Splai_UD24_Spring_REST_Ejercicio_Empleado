CREATE TABLE EMPLEADO
	(
		id int AUTO_INCREMENT PRIMARY KEY,
        nombre varchar (20) NOT NULL,
        apellido varchar (20) NOT NULL,
        dni varchar (20) NOT NULL,
        cargo varchar(20),
        salario int
	);
    
INSERT INTO EMPLEADO (nombre, apellido, dni, cargo, salario) VALUES
	('ROXANNE', 'LOPEZ', '123A', 'manager', 2800),
    ('Jason', 'Stathan', '123B', 'directivo', 3500),
    ('Sting', 'Reed', '123D', 'junior', 1200),
    ('Jean Luc', 'Godard', '123C', 'senior', 2400);