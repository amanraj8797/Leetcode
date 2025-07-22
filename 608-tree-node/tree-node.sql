# Write your MySQL query statement below
select id, case
when p_id is null then 'Root'
WHEN id IN (SELECT p_id FROM Tree WHERE p_id IS NOT NULL) THEN 'Inner'
when id not in (p_id) then 'Leaf'
end as type 
from Tree;