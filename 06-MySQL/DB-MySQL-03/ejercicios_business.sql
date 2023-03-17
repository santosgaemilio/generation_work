SELECT * FROM employee;

-- usamos alias
SELECT last_name AS "apellido" FROM employee;

-- muchos alias
SELECT
	employee_id AS "ID",
	last_name AS "Apellido",
    first_name AS "Nombre",
    salary AS "Salario",
    department AS "Departamento"
FROM employee;

SELECT * FROM employee
WHERE first_name = "Monika";

SELECT * FROM employee
WHERE salary = 500000 AND first_name = "Vivek";

SELECT * FROM employee
WHERE NOT first_name = 'Barrack';

SELECT * FROM employee
ORDER BY department; 

SELECT * FROM employee
ORDER BY department ASC, last_name DESC; 

SELECT COUNT(*) AS "No. Empleados", department FROM employee
GROUP BY department;

SELECT * FROM employee;

-- IN
SELECT * FROM employee
WHERE employee_id IN (1,3,7,8,5);
-- le puedes pasar un tuple de datos como condiones y agarra los que encuentra!

-- BETWEEN
SELECT * FROM employee
WHERE salary BETWEEN 90000 AND 300000;
	-- BETWEEN NOT
SELECT * FROM employee
WHERE salary NOT BETWEEN 200000 AND 500000;
-- hace lo que te imaginas que hace, son rangos inclusivos

-- LIMIT
SELECT * FROM employee
LIMIT 3;

-- LIMIT + OFFSET
SELECT * FROM employee
LIMIT 3 OFFSET 3;
-- Te da los el número de filas que pidas pero empezando después del offset que le diste

-- LIKE
SELECT * FROM employee
WHERE last_name LIKE '%B%';
	-- Los signos de porcentaje te dicen donde van más letras o caracteres diferentes al que
    -- queremos checar! 
	-- Naturalmente LIKE no es case-sensitive
SELECT * FROM employee
WHERE last_name LIKE BINARY '%A';
	-- Si hay apellidos que terminen en 'a' pero con BINARY se hace case-sensitive el filtro
    -- no hay apellidos que terminen con A mayúscula en la tabla
	-- Otro ejemplo acá abajo de los porcentajes
SELECT * FROM employee
WHERE join_date LIKE '2014-02%';
	-- No tienen que ser String o números 

-- UPDATE
SELECT * FROM employee;
UPDATE employee
	SET salary = 500000
    WHERE employee_id IN (8,2);
SELECT * FROM employee;

UPDATE employee
	SET salary = 300000
    WHERE employee_id = 1;
SELECT * FROM employee;

UPDATE employee
	SET salary = 75000
    WHERE employee_id = 6;
SELECT * FROM employee;

-- INSERT
INSERT INTO employee(first_name, last_name, salary, join_date, department)
VALUES ("Emilio", "Santos", "1000000", "2012-12-21", "Admin");

SELECT * FROM employee;

-- Change dates: 
UPDATE employee
	SET join_date = '2013-05-13'
    WHERE employee_id IN (8,2);


UPDATE employee
	SET join_date = '2015-03-17'
    WHERE employee_id = 1;


UPDATE employee
	SET join_date = '2012-02-08'
    WHERE employee_id = 6;
SELECT * FROM employee;


