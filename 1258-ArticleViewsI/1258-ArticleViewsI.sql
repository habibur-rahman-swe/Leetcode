-- Last updated: 10/20/2025, 11:40:14 AM
# Write your MySQL query statement below
select distinct author_id as id from Views where author_id = viewer_id order by author_id;