-- Last updated: 10/20/2025, 11:43:22 AM
# Write your MySQL query statement below
select id, count(*) as num from (select requester_id as id from RequestAccepted
union all
select accepter_id from RequestAccepted) as FC 
group by id 
order by num desc
limit 1;