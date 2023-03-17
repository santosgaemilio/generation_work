-- Ejercicio 1
SELECT * FROM students
WHERE nationality = 125;

-- Ejercicio 2
SELECT 
	COUNT(students_id_student) AS "No.",
    course_code AS "course"
FROM courses_has_students
WHERE course_code = "JAVA-1"
GROUP BY course_code;

-- Ejercicio 3
SELECT 
	COUNT(cs.students_id_student) AS "No. Students",
    m.name AS "Name",
    c.module_code AS "Module"
FROM courses_has_students cs
INNER JOIN courses c ON cs.course_code = c.code
INNER JOIN modules m ON m.code = c.module_code
GROUP BY c.module_code
ORDER BY COUNT(cs.students_id_student) ASC;

-- Ejercicio 4
SELECT COUNT(s.name) AS "Does not have a course"
FROM students s
LEFT JOIN courses_has_students cs ON s.idStudent = cs.students_id_student
WHERE cs.students_id_student IS NULL;




