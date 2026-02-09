-- 코드를 입력하세요
select category, sum(a.s) as total_sales
from (select book_id, sum(sales) as s
from book_sales
where sales_date >= date '2022-01-01' and sales_date <= date '2022-01-31' 
group by book_id) a join  book b on a.book_id = b.book_id
group by category
order by category