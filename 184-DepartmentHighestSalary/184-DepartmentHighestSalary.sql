-- Last updated: 10/20/2025, 11:45:48 AM
# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.salary as Salary from Employee as e left join Department as d on e.departmentId = d.id where (e.departmentId, e.salary) in
(select departmentId, max(salary) from employee group by departmentId);