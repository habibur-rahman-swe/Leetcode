-- Last updated: 10/20/2025, 11:45:58 AM
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  declare k int default 0;
  set k = n - 1;
  RETURN (
      # Write your MySQL query statement below.
      select (select distinct salary from Employee order by salary desc limit 1 offset k)
  );
END