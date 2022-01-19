-- usertbl에 있는 모든 데이터 출력하시오
select * from usertbl;
/*
아래 데이터를 부서테이블에 입력하세요 : 쿼리를 사용하여 입력합니다.
부서코드 부서명 부서지역
ABCDE  개발  강남
BCDEF  설계  강북
CDEFG  분석  강서
*/
insert into dept values('ABCDE','개발','강남');
insert into dept values('BCDEF','설계','강북');
insert into dept values('CDEFG','분석','강서');
select * from dept;
select * from emp;
insert into emp values (null,'CDEFG','KIM',30,default,default);
insert into emp values (null,'ABCDE','LEE',20,default,5000);
insert into emp(dept_code,emp_name,emp_age) values('BCDEF','PARK',25);
create table emp(
	emp_code int auto_increment not null,
    dept_code char(5) not null,
    emp_name varchar(10) not null,
    emp_age int not null,
    emp_hiredate datetime not null default now(),
    emp_salary int not null default 3000,
    primary key(emp_code),
    foreign key(dept_code) references dept(dept_code)
);
create table dept(
 dept_code char(5) primary key,
 dept_name varchar(20) not null,
 dept_loc varchar(20) not null
);
select * from dept;
