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