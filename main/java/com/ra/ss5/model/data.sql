create database students_manager;
use students_manager;
create table students(
                         id int primary key auto_increment,
                         name varchar(100),
                         email varchar(255),
                         birthday date
);
delimiter //
create procedure add_student(IN in_name varchar(100), IN in_email varchar(255),
                             IN in_birthday date)
begin
insert into students(name, email, birthday) values (in_name,in_email,in_birthday);
end;
delimiter ;
delimiter //
create procedure get_all()
begin
select * from students;
end;
delimiter ;
delimiter //
create procedure get_by_id(IN in_id int)
begin
select * from students where id=in_id;
end;
delimiter ;

delimiter //
create procedure update_student(in_id int,in_name varchar(100),in_email varchar(255),in_birthday date)
begin
update students set name=in_name,email=in_email,birthday=in_birthday where id=in_id;
end //
delimiter ;
delimiter //
create procedure delete_student(in_id int)
begin
delete from students where id=in_id;
end //
delimiter ;