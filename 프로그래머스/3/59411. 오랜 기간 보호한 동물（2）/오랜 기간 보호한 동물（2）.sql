-- 코드를 입력하세요
SELECT a.animal_id, a.name
from animal_outs a join (select b.animal_id, datediff(b.datetime, a.datetime) as datetime
from animal_ins a join animal_outs b on a.animal_id = b.animal_id
order by datetime desc
limit 2) b on a.animal_id = b.animal_id
