-- Last updated: 10/20/2025, 11:36:47 AM
# Write your MySQL query statement below
select employee_id
from Employees
where salary < 30000 and manager_id 
not in (
    select employee_id from Employees) 
order by employee_id asc;