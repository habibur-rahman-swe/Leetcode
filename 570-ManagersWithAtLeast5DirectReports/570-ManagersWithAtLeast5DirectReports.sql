-- Last updated: 10/20/2025, 11:43:36 AM
# Write your MySQL query statement below
select e1.name from Employee as e1 join Employee as e2 on e1.id = e2.managerId group by e1.id having count(e2.managerId) >= 5;