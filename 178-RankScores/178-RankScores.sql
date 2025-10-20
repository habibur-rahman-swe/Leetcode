-- Last updated: 10/20/2025, 11:45:56 AM
# Write your MySQL query statement below
select s1.score , count(distinct s2.score) as 'rank' from scores as s1 left join scores as s2 on s1.score <= s2.score group by s1.id order by s1.score desc;