-- 코드를 입력하세요
select category, price as max_price, product_name
from (
    select a.*, 
    row_number() over (partition by category order by price desc) as rn
    from food_product a
    where category in ('과자','국','김치','식용유')
) r
where rn = 1
order by price desc