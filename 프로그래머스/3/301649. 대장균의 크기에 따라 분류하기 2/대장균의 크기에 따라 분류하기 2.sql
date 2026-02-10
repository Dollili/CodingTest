select id,
(case
 when (cnt / 4) >= rn then 'CRITICAL'
 when (cnt / 4) * 2 >= rn then 'HIGH'
 when (cnt / 4) * 3 >= rn then 'MEDIUM'
 else 'LOW' 
 end) as colony_name
from (select id, row_number() over (order by size_of_colony desc) as rn,
      (select count(*) from ecoli_data) as cnt
from ecoli_data) a
order by id
