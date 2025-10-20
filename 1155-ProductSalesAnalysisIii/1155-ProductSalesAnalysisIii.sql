-- Last updated: 10/20/2025, 11:40:31 AM
# Write your MySQL query statement below
select s.product_id, s.year as first_year, s.quantity, s.price from Sales as s where (s.product_id, s.year) in
(select s2.product_id, min(s2.year) from Sales as s2 group by s2.product_id) order by s.product_id;