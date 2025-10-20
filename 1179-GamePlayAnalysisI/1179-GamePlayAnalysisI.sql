-- Last updated: 10/20/2025, 11:40:28 AM
# Write your MySQL query statement below
select player_id, min(event_date) as first_login from Activity group by player_id;