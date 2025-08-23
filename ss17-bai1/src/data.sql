create database studentManagement;
use studentManagement;
create table students(
                         id int primary key auto_increment,
                         name varchar(100),
                         age int
);
delimiter //
create procedure add_students(in_name varchar(100),in_age int)
begin
insert into students (name,age) values (in_name,in_age);
end //
delimiter ;
call add_students('Minh',23);

