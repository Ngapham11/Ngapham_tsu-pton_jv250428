create database student;
use student;
create table students(
                         student_id int primary key auto_increment,
                         full_name varchar(100) not null ,
                         date date not null ,
                         email varchar(100) not null unique
);
delimiter //
create procedure get_all_students()
begin
select *from students;
end //
delimiter ;
call get_all_students();
delimiter //
create procedure add_students(in_full_name varchar(100),in_date date,in_email varchar(100))
begin
insert into students(full_name,date,email)values (in_full_name,in_date ,in_email);
end //
delimiter ;
call add_students('name','2025-05-12','abb@gmail.com');
delimiter //
create procedure update_students(in_student_id int,in_full_name varchar(100),in_date date,in_email varchar(100))
begin
update students set full_name=in_full_name,`date`=in_date,email=in_email where student_id=in_student_id ;
end //
delimiter ;
call update_students(1,'Minh anh','2025-04-11','xyz@gmail.com');
delimiter //
create procedure find_students_by_id(in_student_id int)
begin
select * from students where student_id=in_student_id;
end //
delimiter ;
call find_students_by_id(1);
delimiter //

create procedure delete_by_id(in_student_id int)
begin
    delete from students where student_id=in_student_id;
end //
delimiter ;
call delete_by_id(1);
