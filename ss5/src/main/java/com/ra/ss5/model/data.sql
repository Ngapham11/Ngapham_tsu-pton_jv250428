create database students_manager_ss5;
use students_manager_ss5;
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
delimiter //
create procedure find_all_student(search varchar(255),sort varchar(100))
begin
    if sort='ASC' then select *from students s where search is null or s.name like concat('%',search,'%')
        or s.email like concat('%',search,'%') ;
    end if;
    if sort='DESC' then select *from students s where search is null or s.name like concat('%',search,'%')
                                                  or s.email like concat('%',search,'%') order by s.id DESC ;
    end if;

end //