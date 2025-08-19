use ecommerce;
select name from user;
select product_name,price from product;
select catagory_name,description from category;
select product_id,product_name,stock from product;
select order_id,user.user_id,total_amount from order1
inner join user on order1.user_id=user.user_id;
select name from user where email like '%@gmail.com';
select product_name from product where price>200;
select order_id,total_amount,user.created_at from order1
join user on order1.user_id=user.user_id;
select product_name from product where product_name like '%thoai%'; 
select catagory_name ,count(product_name) as product_count from category c
join product p on p.category_id=c.category_id
group by catagory_name;