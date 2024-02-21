create database employeedetails;
use employeedetails;
create table Employee (
						empno int,
                        ename varchar(20),
                        job varchar(10),
                        mgr int,
                        hiredate date,
                        sal double,
                        comm decimal,
                        deptno int);
                        
use employeedetails;


insert into Employee values
(8369,'SMITH','CLERK',8902,'1990-12-18',800,null,20),
(8499,'ANYA','SALESMAN',8698,'1991-02-20',1600,300,30),
(8521,'SETH','SALESMAN',8698,'1991-02-22',1250,500,30),
(8566,'MAHADEVAN','MANAGER',8839,'1991-04-02',2985,null,20),
(8654,'MOMIN','SALESMAN',8698,'1991-09-28',1250,1400,30),
(8698,'BINA','MANAGER',8839,'1991-05-01',2850,null,30),
(8882,'SHIVANSH','MANAGER',8839,'1991-06-09',2450,null,10),
(8888,'SCOTT','ANALYST',8566,'1992-12-09',3000,null,20),
(8839,'AMIR','PRESIDENT',null,'1991-11-18',5000,null,10),
(8844,'KULDEEP','SALESMAN',8698,'1991-09-08',1500,0,30);

select * from Employee;

select ename,sal from Employee where sal>=2200;

select * from Employee where comm is null;

select ename,sal from Employee where sal not between 2500 and 4000;

select ename,job,sal from Employee where mgr is null;

select ename from Employee where ename like '__A%';

select ename from Employee where ename like '%T' ;


