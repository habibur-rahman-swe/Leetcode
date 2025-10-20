-- Last updated: 10/20/2025, 11:43:17 AM
# Write your MySQL query statement below
select x, y, z, 
if((x + y > z and y + z > x and z + x  > y), 'Yes', 'No') as triangle
from Triangle;