-- Last updated: 10/20/2025, 11:43:18 AM
# Write your MySQL query statement below
select id,
    case
        when p_id is null then 'Root'
        when id in (select p_id from Tree) then 'Inner'
        else  'Leaf' 
    end as type
from Tree;