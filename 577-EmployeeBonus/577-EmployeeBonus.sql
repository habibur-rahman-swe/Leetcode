-- Last updated: 10/20/2025, 11:43:32 AM
# Write your MySQL query statement below
select
  Employee.name, Bonus.bonus
From
  Employee
    Left join
  Bonus on Employee.empId = Bonus.empId
where bonus < 1000 or bonus is null
;