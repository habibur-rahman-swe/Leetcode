-- Last updated: 10/20/2025, 11:45:51 AM
# Write your MySQL query statement below
select distinct p1.email as Email from Person as p1, Person as p2 where p1.id != p2.id and p1.email = p2.email;