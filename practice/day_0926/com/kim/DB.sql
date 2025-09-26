use exdb;

show tables;
create table if not exists users(
    id varchar(50),
    name varchar(100)
);
drop table users;

insert into users value ('1', '홍길동');

SELECT * FROM users;

delete from users where id = '2';

update users set name = '장영실_수정후' where id = '4';

select * from users;