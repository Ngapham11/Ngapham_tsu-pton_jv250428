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
delimiter //
create procedure update_students(in_id int,in_name varchar(100),in_age int)
begin
Update students set name=in_name,age=in_age where id=in_id;
end //
delimiter ;
call update_students(1,'Quynh',25);

