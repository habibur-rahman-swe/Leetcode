-- Last updated: 10/20/2025, 11:39:36 AM
# Write your MySQL query statement below
select s.student_id, s.student_name, sub.subject_name, count(e.subject_name) as attended_exams from students s join subjects as sub left join examinations as e on s.student_id = e.student_id and sub.subject_name = e.subject_name group by s.student_id, sub.subject_name order by s.student_id;