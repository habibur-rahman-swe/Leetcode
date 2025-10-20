-- Last updated: 10/20/2025, 11:45:44 AM
# Write your MySQL query statement below
select w1.id as id from weather as w1 join weather as w2 on datediff(w1.recordDate, w2.recordDate) = 1 and w1.Temperature > w2.Temperature;