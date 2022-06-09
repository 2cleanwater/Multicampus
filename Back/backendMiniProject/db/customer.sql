DROP TABLE tb_customer;
create table tb_customer(
	id varchar(20) ,
	password varchar(30) not null,
	telephone varchar(16),
	birth date,
	sex varchar(10),
	addr text);
	

insert into tb_customer values('2cleanwater','1234','010-8888-7777','1994-12-16','male','서울시비둘기구구레로레로');
insert into tb_customer values('saruman','1234','010-8888-7777',null,'female',null);
insert into tb_customer values('gandalf','1234','010-8888-7777','1994-12-16','male','서울시비둘기구구레로레로');


select * from tb_customer;
