drop database if exists customer_db;
create database customer_db;
use  customer_db;


create table customer(
   customer_id int,
   email_id varchar(50) unique,
   name varchar(20),
   date_of_birth date,
   
   constraint ps_customer_id_pk primary key (customer_id)
);


insert into customer (customer_id, email_id, name, date_of_birth) values (1, 'martin@infy.com', 'martin', '1994-05-20');
insert into customer (customer_id, email_id, name, date_of_birth) values (2, 'john@infy.com', 'john', '1993-05-20');
insert into customer (customer_id, email_id, name, date_of_birth) values (3, 'james@infy.com', 'james', '1997-05-20');
insert into customer (customer_id, email_id, name, date_of_birth) values (4, 'martin01@infy.com', 'martin', '2000-05-20');
insert into customer (customer_id, email_id, name, date_of_birth) values (5, null, 'tim', '2004-04-20');

commit;
select * from customer;
