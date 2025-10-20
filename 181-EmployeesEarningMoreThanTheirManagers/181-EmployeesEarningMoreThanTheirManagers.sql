-- Last updated: 10/20/2025, 11:45:53 AM
# Write your MySQL query statement below
select e.name as Employee from Employee as e left join Employee as m on e.managerId = m.id where e.salary > m.salary;