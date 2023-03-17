-- INNER JOIN sencillo
SELECT students.name, 
students.last_name,countries.Name AS "country", 
countries.Code  
FROM students
INNER JOIN countries 
ON countries.idCountries = students.nationality;

-- Encontrar que tipo de ID tienen

SELECT
	students.idStudent AS "ID",
	students.name AS  "Name",
	students.last_name AS "Last name",
	idtypes.name AS 'Tipo de registro'
FROM students
INNER JOIN idtypes
ON idtypes.id_idTypes = students.IdType_id;


-- Abreviaciones
SELECT
	t1.name,
    t2.name, 
    t2.code
FROM students t1 -- Se escribe com linea para cambiar el nom de la tabla en el Query
INNER JOIN countries t2
ON t2.idCountries = t1.nationality;

