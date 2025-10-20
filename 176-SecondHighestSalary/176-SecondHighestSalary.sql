-- Last updated: 10/20/2025, 11:45:59 AM
# Write your MySQL query statement below
# select (select distinct Salary from Employee order by salary desc limit 1 offset 1) as SecondHighestSalary;
select (select distinct Salary from Employee order by Salary desc limit 1 offset 1) as SecondHighestSalary;