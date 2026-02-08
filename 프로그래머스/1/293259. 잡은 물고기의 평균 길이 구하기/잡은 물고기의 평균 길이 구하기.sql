-- 코드를 작성해주세요
select round(avg(a.total), 2) as average_length
from (select ifnull(length, 10) as total
from fish_info
) a
