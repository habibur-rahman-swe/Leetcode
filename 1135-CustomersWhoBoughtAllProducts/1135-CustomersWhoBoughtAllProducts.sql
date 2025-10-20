-- Last updated: 10/20/2025, 11:40:37 AM
# Write your MySQL query statement below
select customer_id from Customer
group by customer_id
having count(distinct product_key) = (select count(product_key) from Product);

# # Write your MySQL query statement below

# SELECT  customer_id FROM Customer GROUP BY customer_id
# HAVING COUNT(distinct product_key) = (SELECT COUNT(product_key) FROM Product);