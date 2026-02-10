select a.id, ifnull(count(b.parent_id), 0) as child_count
from ecoli_data a left join ecoli_data b on a.id = b.parent_id
group by a.id
order by a.id