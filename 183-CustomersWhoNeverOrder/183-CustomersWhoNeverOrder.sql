-- Last updated: 10/20/2025, 11:45:50 AM
# Write your MySQL query statement below
select c.name as Customers from Customers as c left join Orders as o on c.id = o.customerId where o.id is null;