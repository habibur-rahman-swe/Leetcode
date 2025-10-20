-- Last updated: 10/20/2025, 11:43:19 AM
# Write your MySQL query statement below
select s.name from SalesPerson as s where s.sales_id not in (select o.sales_id from Orders as o left join Company as c on o.com_id = c.com_id where c.name = 'RED');