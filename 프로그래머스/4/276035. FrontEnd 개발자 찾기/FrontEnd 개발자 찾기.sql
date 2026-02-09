-- 코드를 작성해주세요
select distinct id, email, first_name, last_name
from developers a join skillcodes b on b.code = a.skill_code & b.code
where category = 'Front End'
order by id