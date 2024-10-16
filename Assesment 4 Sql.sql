
create table worker(worker_id int primary key,firstname varchar(50),
lastname varchar(50),salary bigint,joiningdate date,
department varchar(50))

create table bonus(worker_refid int references worker(worker_id),
bonus_amount bigint,bonus_date date)

create table title(worker_refid int references worker(worker_id),
worker_title varchar(50),affected_from date)

insert into worker(worker_id,firstname,lastname,salary,joiningdate,department)
values
(1,'MONIKA','ARORA',100000,'2020-02-14','HR'),
(2,'NIHARIKA','VERMA',80000,'2011-02-14','ADMIN'),
(3,'VISHAL','SINGHAL',300000,'2020-02-14','HR'),
(4,'AMITABH','SINGH',500000,'2020-02-14','ADMIN'),
(5,'VIVEK','BATH',500000,'2011-06-14','ADMIN'),
(6,'VIPUL','DIWAN',200000,'2011-06-14','ACCOUNT'),
(7,'SATHISH','KUMAR',75000,'2020-01-14','ACCOUNT'),
(8,'GEETHIKA','CHAUHAN',90000,'2011-04-14','ADMIN')

INSERT INTO bonus (worker_refid, bonus_amount, bonus_date) VALUES
(1, 5000, '2020-02-16'),
(2, 3000, '2011-06-16'),
(3, 4000, '2020-02-16'),
(1, 4500, '2020-02-16'),
(2, 3500, '2011-02-16'),
(4, 4500, '2020-02-16'),
(5, 3500, '2011-02-16');

INSERT INTO title (worker_refid, worker_title, affected_from) VALUES
(1, 'Manager', '2016-02-20'),
(2, 'Executive', '2016-06-11'),
(8, 'Executive', '2016-06-11'),
(5, 'Manager', '2016-06-11'),
(4, 'Asst. Manager', '2016-06-11'),
(7, 'Executive', '2016-06-11'),
(6, 'Lead', '2016-06-11'),
(3, 'Lead', '2016-06-11');

SELECT 
    w.FIRSTNAME, 
    w.SALARY, 
    t.WORKER_TITLE 
FROM 
    Worker w
JOIN 
    Title t ON w.WORKER_ID = t.WORKER_REFID;


CREATE FUNCTION get_worker_count_by_nth_highest_salary(n INTEGER)
RETURNS INTEGER AS $$
DECLARE
    nth_highest_salary BIGINT;
    worker_count INTEGER;
BEGIN
    SELECT DISTINCT salary INTO nth_highest_salary
    FROM worker
    ORDER BY salary DESC
    OFFSET n - 1 LIMIT 1;
	
    IF nth_highest_salary IS NULL THEN
        RETURN 0;
    END IF;

    SELECT COUNT(*) INTO worker_count
    FROM worker
    WHERE salary = nth_highest_salary;

    RETURN worker_count;
END;
$$ LANGUAGE plpgsql;

SELECT get_worker_count_by_nth_highest_salary(1)
