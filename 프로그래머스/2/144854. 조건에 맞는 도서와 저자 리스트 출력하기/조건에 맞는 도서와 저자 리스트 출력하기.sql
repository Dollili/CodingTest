-- 코드를 입력하세요
select book_id, author_name, to_char(published_date, 'YYYY-MM-dd') as published_date
from book a join author b on a.author_id = b.author_id
where a.category = '경제'
order by published_date