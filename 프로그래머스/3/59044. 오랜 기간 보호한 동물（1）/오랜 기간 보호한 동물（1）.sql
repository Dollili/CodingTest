-- 코드를 입력하세요
select name, datetime
from (select a.*, row_number() over(order by a.datetime) as rn
from animal_ins a left outer join animal_outs b on a.animal_id = b.animal_id
where b.animal_id is null)
where rn <= 3
order by datetime