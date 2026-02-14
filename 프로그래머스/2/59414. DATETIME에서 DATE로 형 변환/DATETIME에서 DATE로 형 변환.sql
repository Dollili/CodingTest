-- 코드를 입력하세요
SELECT animal_id, name, to_char(datetime, 'YYYY-MM-dd') as datetime
from animal_ins 
order by animal_id