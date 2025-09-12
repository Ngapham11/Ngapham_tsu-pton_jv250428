create database project_manager;
use project_manager;
create table project(
                        id int primary key auto_increment,
                        name varchar(200) not null  unique ,
                        description text,
                        image varchar(255)
);
delimiter //
create procedure find_all()
begin
select *from project;
end //
delimiter ;