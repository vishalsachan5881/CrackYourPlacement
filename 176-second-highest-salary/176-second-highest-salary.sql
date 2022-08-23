# Write your MySQL query statement below
select Max(salary) as "SecondHighestSalary"
from employee 
where salary Not in (
select Max(salary) from employee
);

