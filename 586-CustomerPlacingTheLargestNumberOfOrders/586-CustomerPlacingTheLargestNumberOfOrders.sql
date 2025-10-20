-- Last updated: 10/20/2025, 11:43:26 AM
# Write your MySQL query statement below
select customer_number
from Orders
group by customer_number
order by count(order_number) desc
limit 1;