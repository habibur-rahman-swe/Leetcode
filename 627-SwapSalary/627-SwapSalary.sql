-- Last updated: 10/20/2025, 11:43:08 AM
# Write your MySQL query statement below
update Salary set sex =
    case
        when sex = 'm' then 'f'
        else 'm'
    end;