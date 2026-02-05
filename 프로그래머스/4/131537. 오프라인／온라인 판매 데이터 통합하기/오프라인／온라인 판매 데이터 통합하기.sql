-- 코드를 입력하세요
SELECT to_char(sales_date, 'YYYY-MM-dd') as sales_date, product_id, user_id, sales_amount
from online_sale 
where (extract(year from sales_date) = 2022 and extract(month from sales_date) = 3)

union

SELECT to_char(sales_date, 'YYYY-MM-dd') as sales_date, product_id, null as user_id, sales_amount
from offline_sale 
where (extract(year from sales_date) = 2022 and extract(month from sales_date) = 3)
order by sales_date, product_id, user_id