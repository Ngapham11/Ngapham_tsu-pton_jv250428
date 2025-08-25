create database db_workshop;
use db_workshop;
create table workshop_plan(
                              workshop_id int primary key auto_increment,
                              workshop_name varchar(150)not null  unique ,
                              date_implement date not null ,
                              speaker_name varchar(70) not null ,
                              speaker_phone varchar(20)not null ,
                              status tinyint default 1
);
delimiter //
create procedure get_all()
begin
select *from workshop_plan ;
end //
delimiter ;
call get_all();

delimiter //
create procedure add_workshop(ws_name varchar(150),ws_date date,in_skname varchar(70),in_skphone varchar(20),in_status tinyint)
begin
insert into workshop_plan(workshop_name, date_implement, speaker_name, speaker_phone,status)
values(ws_name,ws_date,in_skname,in_skphone,in_status) ;
end //
delimiter ;

call add_workshop('khanh','2022-12-23','acc','123333',2);
delimiter //
create procedure get_by_id(ws_id int)
begin
select *from workshop_plan where workshop_id=ws_id;
end //
delimiter ;
call get_by_id(1);
delimiter //
create procedure update_workshop(ws_id int,ws_name varchar(150),ws_date date,in_skname varchar(70),in_skphone varchar(20),in_status tinyint)
begin
update workshop_plan set workshop_name=ws_name,date_implement=ws_date,
                         speaker_name=in_skname,speaker_phone=in_skphone,status=in_status where workshop_id=ws_id;
end //
delimiter ;
call update_workshop(1,'tuanh','2022-12-24','trang','123456',2);
delimiter //
create procedure delete_workshop(ws_id int)
begin
delete from workshop_plan where workshop_id=ws_id ;

end //
delimiter ;
call delete_workshop(1);
drop procedure delete_workshop;
delimiter //
create procedure search_by_name(ws_name varchar(150))
begin
select *from workshop_plan where speaker_name like concat('%',ws_name,'%');
end //
delimiter ;
