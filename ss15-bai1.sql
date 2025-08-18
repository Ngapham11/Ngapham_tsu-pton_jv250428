create database Ecommerce;
use Ecommerce;
create table user(
user_id int primary key auto_increment,
name varchar(100) not null,
email varchar(255) not null unique,
password  varchar(100) not null,
created_at timestamp default current_timestamp
);

INSERT INTO user(name, email, password)
VALUES
('Phạm Văn C', 'phamvanc@gmail.com', 'matkhau_ma_hoa_987'),
('Hoàng Thị D', 'hoangthid@gmail.com', 'matkhau_ma_hoa_654'),
('Trần Văn E', 'tranvane@yahoo.com', 'matkhau_ma_hoa_321'),
('Lý Thu F', 'lythuf@hotmail.com', 'matkhau_ma_hoa_999'),
('Đặng Quốc G', 'dangquocg@outlook.com', 'matkhau_ma_hoa_777');
select *from user;
create table category(
category_id int primary key auto_increment,
catagory_name varchar(100) not null unique,
description varchar(255)
);
INSERT INTO category (catagory_name, description)
VALUES
('Thời trang', 'Các sản phẩm liên quan đến quần áo và phụ kiện.'),
('Điện tử', 'Các thiết bị điện tử như điện thoại, máy tính, và phụ kiện.'),
('Sách', 'Các loại sách từ tiểu thuyết, truyện tranh đến sách giáo khoa.'),
('Đồ gia dụng', 'Các vật dụng cần thiết trong gia đình.'),
('Mỹ phẩm', 'Các sản phẩm chăm sóc da, trang điểm và làm đẹp.');
select*from category;
create table product(
product_id varchar(10) primary key,
product_name varchar(100) not null unique,
price decimal(15,2) not null check (price>0),
stock int default 0,
category_id int,
foreign key (category_id)references category(category_id)
);
INSERT INTO product (product_id, product_name, price, stock, category_id)
VALUES
('P001', 'Áo thun cơ bản', 15.99, 150, 1),       
('P002', 'Điện thoại thông minh', 599.50, 75, 2), 
('P003', 'Sách khoa học viễn tưởng', 9.99, 200, 3),  
('P004', 'Nồi chiên không dầu', 79.00, 50, 4),  
('P005', 'Kem dưỡng ẩm', 25.45, 120, 5);    
select*from product;
create table order1(
order_id int primary key auto_increment,
user_id int,
foreign key (user_id)references user(user_id),
created_at timestamp default current_timestamp,
total_amount decimal(15,2) 
);
INSERT INTO order1 (user_id, total_amount)
VALUES
(1, 150.75),
(2, 299.99),
(3, 50.00),
(4, 12.50),
(5, 80.25);
select *from order1;
create table order_detail(
order_id int,
foreign key (order_id)references order1(order_id),
product_id varchar(10),
foreign key (product_id)references product(product_id),
quantity int not null check(quantity>0),
price_at_time decimal(15,2) not null,
primary key(order_id,product_id)
);
INSERT INTO order_detail (order_id, product_id, quantity, price_at_time)
VALUES
(1, 'P001', 2, 15.99),
(1, 'P002', 1, 599.50),
(2, 'P003', 5, 9.99),
(2, 'P005', 1, 25.45),
(3, 'P004', 1, 79.00),
(3, 'P001', 1, 15.99),
(4, 'P005', 3, 25.45),
(4, 'P002', 1, 599.50),
(5, 'P003', 10, 9.99),
(5, 'P004', 2, 79.00);
select*from order_detail ;
update product
set stock=10
where product_id='P005';
update category
set catagory_name='Thoi trang va phu kien'
where category_id=1;