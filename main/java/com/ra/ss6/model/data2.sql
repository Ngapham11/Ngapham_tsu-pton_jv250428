create database movie_manager;
use movie_manager;
create table movies(
                       id int primary key auto_increment,
                       title varchar(100),
                       director varchar(255),
                       genre varchar(100)
);
delimiter //
create procedure get_all()
begin
select *from movies;
end //
delimiter ;
delimiter //
create procedure add_movies(in_title varchar(100),in_director varchar(255),in_genre varchar(100))
begin
insert into movies( title, director, genre) values (in_title,in_director,in_genre);
end //
delimiter ;
delimiter //
create procedure find_by_id(in_id int)
begin
select *from movies where id=in_id;
end //
delimiter ;
delimiter //
create procedure delete_movie(in_id int)
begin
delete from movies where id=in_id;
end //
delimiter ;
delimiter //
create procedure update_movie(in_id int,in_title varchar(100),in_director varchar(255),in_genre varchar(100))
begin
update movies set title=in_title,director=in_director,genre=in_genre where id=in_id;
end //
delimiter ;
