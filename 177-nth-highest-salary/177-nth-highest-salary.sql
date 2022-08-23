CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      select distinct salary from Employee e 
      where (n-1) = (
      select count(distinct(salary)) 
          from employee e2
          where e2.salary > e.salary
      )
  );
END