-- Last updated: 10/20/2025, 11:43:12 AM
# Write your MySQL query statement below
select(select num from MyNumbers group by num having count(num) = 1 order by num desc limit 1) as num;