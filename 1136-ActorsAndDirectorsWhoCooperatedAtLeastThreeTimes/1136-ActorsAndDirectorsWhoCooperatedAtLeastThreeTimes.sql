-- Last updated: 10/20/2025, 11:40:36 AM
# Write your MySQL query statement below
select actor_id, director_id
from (
    select actor_id, director_id, count(timestamp) as cooperated from  ActorDirector  group by actor_id, director_id
) tb  where cooperated >= 3;