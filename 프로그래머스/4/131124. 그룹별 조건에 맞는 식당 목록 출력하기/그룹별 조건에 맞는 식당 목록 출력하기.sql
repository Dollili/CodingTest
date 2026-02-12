-- 코드를 입력하세요
select a.member_name, review_text, to_char(review_date, 'YYYY-MM-dd') as review_date
from member_profile a join rest_review b on a.member_id = b.member_id
where a.member_id in 
        (select member_id
         from rest_review
         group by member_id
         having count(*) = (select max(count(*))
                            from rest_review
                            group by member_id))
order by review_date, review_text
