-- Last updated: 10/20/2025, 11:39:15 AM
# Write your MySQL query statement below
select u.unique_id, e.name from Employees as e left join EmployeeUNI as u on e.id = u.id;