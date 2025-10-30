create database customer_manager;
use customer_manager;
create table customers(
                          id int primary key auto_increment,
                          name varchar(100),
                          phone varchar(100),
                          address varchar(255),
                          gender varchar(100),
                          email varchar(255),
                          role enum('ADMIN', 'USER')
);
delimiter //
create procedure get_all()
begin
select *from customers;
end //
delimiter ;
delimiter //
create procedure add_customer(in_name varchar(100),in_phone varchar(100),in_address varchar(255),
                              in_gender varchar(100),in_email varchar(255),in_role enum('ADMIN', 'USER'))
begin
insert into customers( name, phone, address, gender, email, role)
values (in_name,in_phone,in_address,in_gender,in_email,in_role);
end //
delimiter ;
delimiter //
create procedure get_by_name(in_name varchar(100))
begin
    select *from customers where name="in_name";
end //
delimiter ;
