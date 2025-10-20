-- Last updated: 10/20/2025, 11:43:23 AM
# Write your MySQL query statement below
select class from (select class, count(student) as num from courses group by class) as c where c.num >= 5;