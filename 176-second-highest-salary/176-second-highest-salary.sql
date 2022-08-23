# Write your MySQL query statement below
select Max(salary) as SecondHighestSalary 
from Employee as e
where salary Not in (select Max(salary) from Employee);

