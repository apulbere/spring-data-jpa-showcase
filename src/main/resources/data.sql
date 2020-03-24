INSERT INTO student(student_id, first_name, last_name, full_time, birth_date) VALUES (1001, 'John', 'Doe', true, '1993-06-15');
INSERT INTO student(student_id, first_name, last_name, full_time, birth_date) VALUES (1002, 'Jane', 'Doe', true, '1990-12-24');
INSERT INTO student(student_id, first_name, last_name, full_time, birth_date) VALUES (1003, 'Mike', 'Smith', false, '2000-01-14');

INSERT INTO staff_member(id, first_name, last_name) VALUES (2001, 'John', 'Jones');
INSERT INTO staff_member(id, first_name, last_name) VALUES (2002, 'Judy', 'Miller');
INSERT INTO staff_member(id, first_name, last_name) VALUES (2003, 'Catalina', 'Davids');
INSERT INTO staff_member(id, first_name, last_name) VALUES (2004, 'Alison', 'Moore');

INSERT INTO department(id, name, chair_id) VALUES (3001, 'Natural Sciences', 2001);
INSERT INTO department(id, name, chair_id) VALUES (3002, 'Social Sciences', 2002);

INSERT INTO course(id, credits, name, department_id, instructor_id) VALUES (4001, 3, 'Chemistry', 3001, 2003);
INSERT INTO course(id, credits, name, department_id, instructor_id) VALUES (4002, 4, 'Physics', 3001, 2004);

INSERT INTO student_courses(student_student_id, courses_id) VALUES (1001, 4001);
INSERT INTO student_courses(student_student_id, courses_id) VALUES (1001, 4002);