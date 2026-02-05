-- 코드를 입력하세요

select count(*)
from (select distinct name
from animal_ins
where name is not null)
 

--where name is not null
--group by animal_type