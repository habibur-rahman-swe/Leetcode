-- Last updated: 10/20/2025, 11:35:14 AM
# Write your MySQL query statement below
select teacher_id, count(distinct subject_id) as cnt from Teacher group by teacher_id;