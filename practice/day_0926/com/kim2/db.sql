use exdb;

drop table users;

create table if not exists users
(
    id   varchar(50),
    name varchar(100)
);
show Tables;
desc users;

insert into users(id, name) values (?,?);

select * from users;

delete from users where id = ?;