-- 코드를 입력하세요
select food_type, rest_id, rest_name, favorites
from (SELECT a.*, 
row_number() over (
partition by food_type
order by favorites desc) as top
from rest_info a)
where top = 1
order by food_type desc
