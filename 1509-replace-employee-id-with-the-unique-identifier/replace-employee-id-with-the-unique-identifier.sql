# Write your MySQL query statement below
select 
unique_id, 
name
from Employees as emp
left join EmployeeUNI as emp_uid
on emp.id = emp_uid.id;