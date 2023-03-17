USE generation;
SELECT
s.name AS "Name",
s.last_name AS "Last Name",
s.idStudent AS "ID",
cs.course_code AS "Course Code",
c.name AS "Course Name",
c.credits AS "Creditos"

FROM students s
INNER JOIN courses_has_students cs ON s.idStudent = cs.students_id_student
INNER JOIN courses c ON c.code = cs.course_code;

SELECT * FROM courses_has_students
WHERE students_id_student = 10545;

-- Hacer los GROUP BYs
SELECT 
DISTINCT(cs.course_code) AS 'Codigo de curso',
c.code AS 'Codigo de curso',
c.name AS 'Curso'
FROM courses_has_students cs
INNER JOIN courses c
ON cs.course_code = c.code;
-- GROUP BY c.code;

SELECT 
cs.course_code AS 'Codigo de curso',
c.code AS 'Codigo de curso',
c.name AS 'Curso'
FROM courses_has_students cs
INNER JOIN courses c
ON cs.course_code = c.code
GROUP BY c.code;

