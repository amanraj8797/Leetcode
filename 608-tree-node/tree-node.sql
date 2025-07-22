# Write your MySQL query statement below
select id, case
when p_id is null then 'Root'
when id in (select p_id from Tree) then 'Inner'
when id not in (p_id) then 'Leaf'
end as type 
from Tree;