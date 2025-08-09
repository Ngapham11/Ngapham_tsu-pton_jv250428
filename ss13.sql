create database ss13_bai1;
use ss13_bai1;
-- tao bang
create table book(
bookId int primary key auto_increment,
title  varchar(100) not null,
author varchar(50) not null,
category varchar(50) not null
);
create table readers(
readerId int primary key auto_increment,
name varchar(50) not null,
birthday date not null,
address varchar(255),
phoneNumber varchar(11)
);

create table borrow(
borrowId int primary key auto_increment,
borrowDate date not null ,
returnDate date,
bookId int,
readerId int,
foreign key(bookId) references book(bookId),
foreign key(readerId) references readers(readerId)
);
INSERT INTO book( title, author, category)
values ('Meo va chuot','Minh','truyen tranh'),('De den va de trang','Tu Anh','Truyen tranh'),
('Be oi ngu ngon','Ngoc','truyen tranh'),('Be oi ngu ngon','Ngoc','truyen tranh'),
('Be oi ngu ngon','Ngoc','truyen tranh'),
('Be oi ngu ngon','Ngoc','truyen tranh'),('Be oi ngu ngon','Ngoc','truyen tranh'),('Be oi ngu ngon','Ngoc','truyen tranh')
;
UPDATE book
SET author='Nguyen van a'
where bookId=1;
select * from book
where title like 'A%' or title like 'B%';
insert into  readers(name,birthday,address,phoneNumber) values('Thanh','12-5-2003','Ha noi','12341234234'),('Anh','12-5-2025','Ha noi','12341234234')
,('Trang','12-5-2009','Ha noi','12341234234'),('Quynh','12-5-2010','Ha noi','12341234234'),
('Quang','12-5-2010','Ha noi','12341234234'),('Quoc','12-5-2012','Ha noi','12341234234'),('Thanh','12-5-2025','Ha noi','12341234234');
select * from readers
where name ='Quynh';