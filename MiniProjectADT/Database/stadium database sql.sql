create table admin(id serial primary key,admin_name varchar(20) not null unique,admin_pass varchar(20) not null);
create table users(user_id serial primary key,user_name varchar(20) not null unique,user_pass varchar(20) not null,hint varchar(50),name varchar(50) not null,email varchar(40) not null,mobnum varchar(10) unique,avail_seat int);
ALTER TABLE users ALTER avail_seat SET DEFAULT 5;
create table booking(user_id int references users(id),booking_id serial primary key,seat_num int(5) unique,food_id int unique,amt double,status varchar(50));
ALTER TABLE booking ALTER status SET DEFAULT 'Pending';
create table food_order(food_id int references booking(food_id),items varchar(20),quantity int);
create table stadium(name varchar(40) primary key,city varchar(40) not null,address varchar(100) not null,phone int unique);
create table sportevent(stadium_name varchar(40) references stadium(name),event_name varchar(50) not null,start_date date not null,start_time time not null);
create table user_info(user_id serial primary key,user_name varchar(20) not null unique,user_pass varchar(20) not null,hint varchar(50),name varchar(50) not null,email varchar(40) not null,mobnum varchar(10) unique,avail_seat int);
select * from admin;
select * from users;
select * from booking;
select * from user_info;
select * from food_order;
select * from stadium;
select * from sportevent;


SELECT users.user_name, user_info.user_name FROM users JOIN user_info ON users.user_id = user_info.user_id;
select * from users natural join user_info;
select booking_id,seat_num,food_id from booking;
select user_id from users where user_name='Sandeep';


insert into admin(admin_name,admin_pass) values('Admin','admin@123');
insert into admin(admin_name,admin_pass) values('Chintamani','Chintu@123');
insert into users(user_name,user_pass,hint,name,email,mobnum) values('Chintamani','Chintu@123','name@123','Chintamani Naik','n.chintamani103@gmail.com',7769041432);
update users set hint='name@123' where user_id=1;
insert into users(user_name,user_pass) values('Nikhil','nick@123');



insert into booking(user_id,seat_num) values(1,'{10,11,12,13}');
insert into booking(user_id,seat_num) values(2,'{21,22,23}');
update booking set food_id=7 where booking_id=1;
delete from booking where booking_id=1;
delete from user_info where user_id=2;

insert into food_order values(7,'{Popcorn,Sandwich}','{2,2}');

insert into stadium values('Wankhede Stadium','Mumbai','Vinoo Mankad Rd, Church gate, Mumbai, Maharashtra 400020',1234567890);
insert into sportevent values('Wankhede Stadium','Cricket Match:India vs Australia','2018-09-20','10:14:12');
insert into sportevent values('Wankhede Stadium','Cricket Match:India vs Australia','2018-10-20','23:14:12');

SELECT DATE_FORMAT(start_date, '%d/%m/%y') AS Result from sportevent ;
 SELECT DATE_FORMAT(curdate(), '%d/%m/%y') AS Result;