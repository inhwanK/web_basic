select user(),database();

delete
  from title 
 where tno = 12312;
 
select *
  from department;
  
drop table member;
create table member(
				id varchar(15) not null,
				password varchar(100),
				name varchar(15),
				age int(11),
				gender varchar(5),
				email varchar(30),
				primary key(id)
)

