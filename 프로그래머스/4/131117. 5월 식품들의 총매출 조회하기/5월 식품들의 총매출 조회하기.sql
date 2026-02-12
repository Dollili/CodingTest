-- 코드를 입력하세요
SELECT a.product_id, a.product_name, sum(b.amount * a.price) as total_sales
from food_product a join food_order b on a.product_id = b.product_id
where extract(year from b.produce_date) = 2022 and extract(month from b.produce_date) = 5  
group by a.product_id, a.product_name
order by 3 desc, 1