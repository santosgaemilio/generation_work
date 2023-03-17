-- MIN
SELECT MIN(salary) FROM employee;
	-- Comprobación
SELECT salary FROM employee
ORDER BY salary ASC
LIMIT 2;

-- MAX
SELECT MAX(salary) FROM employee;

-- AVG
SELECT AVG(salary) AS promedio FROM employee;
	-- Se puede trabajar con el promedio de fechas, pero no tiene mucho sentido
-- SUM
SELECT SUM(employee_id) FROM employee;
SELECT SUM(salary), AVG(salary) FROM employee;

-- COUNT
SELECT COUNT(DISTINCT(salary)) FROM employee;
	-- COUNT va de la mano con GROUP BY 
-- DISTINCT es la clásica, te da los valores únicos 
