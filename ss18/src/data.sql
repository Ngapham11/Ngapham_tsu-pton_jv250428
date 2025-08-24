create database product_manager;
use product_manager;
create table product(
                        product_id int primary key auto_increment,
                        product_name varchar(100) not null unique ,
                        product_price float not null check ( product_price>0 ),
                        product_title varchar(200) not null ,
                        product_created date not null ,
                        product_catalog varchar(100) not null ,
                        product_status bit default 1
);
-- lay tat ca thong tin san pham
delimiter //
create procedure get_all_product()
begin
select *from product;
end //
delimiter ;
call get_all_product();
-- Them moi san pham
delimiter //
create procedure create_product(pro_name varchar(100),pro_price float,pro_title varchar(200),
                                pro_created date,pro_catalog varchar(100),pro_status bit)
begin
insert into product(product_name,product_price,product_title,product_created,product_catalog,product_status)
values (pro_name,pro_price,pro_title,pro_created,
        pro_catalog,pro_status);
end //
delimiter ;
call create_product('khanh',200,'ao','2024-03-22','ao',true);
-- cap nhat san pham theo ma
delimiter //
create procedure update_product(pro_id int,pro_name varchar(100),pro_price float,pro_title varchar(200),
                                pro_created date,pro_catalog varchar(100),pro_status bit)
begin
update product set
                   product_name=pro_name,
                   product_price=pro_price,
                   product_title=pro_title,
                   product_created=pro_created,
                   product_catalog=pro_catalog,
                   product_status=pro_status where product_id=pro_id;

end //
delimiter ;
call update_product(1,'quang',150,'sach','2023-12-12','sach',false);
-- xoa san pham theo ma
delimiter //
create procedure delete_product(pro_id int)
begin
delete from product where product_id=pro_id;

end //
delimiter ;
call delete_product(2);
-- lay thong tin theo ma
delimiter //
create procedure get_product_by_id(pro_id int)
begin
select *from product where product_id=pro_id;

end //
delimiter ;
call get_product_by_id(3);
-- tim san pham theo ten san pham
delimiter //
create procedure get_product_by_name(pro_name varchar(100))
begin
select *from product where product_name like concat('%',pro_name,'%');

end //
delimiter ;
call get_product_by_name('minh');
