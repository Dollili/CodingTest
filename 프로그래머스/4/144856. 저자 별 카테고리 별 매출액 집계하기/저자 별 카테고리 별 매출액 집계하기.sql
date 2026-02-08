-- 코드를 입력하세요
select author_id, author_name, category, sum(total_sales) as total_sales
from (select a.author_id, a.category, author.author_name, a.price * b.sales as total_sales
from book a ,(SELECT book_id, SUM(sales) as sales
from book_sales
where extract(year from sales_date) = 2022
and extract(month from sales_date) = 1
group by book_id) b, author
where a.book_id = b.book_id
and a.author_id = author.author_id) t
group by (author_id, author_name, category)
order by author_id, category desc