-- 코드를 입력하세요
 SELECT b.rest_id, rest_name, food_type, favorites, address, round(r.score, 2) as score
from
    (select a.rest_id as rest_id, avg(review_score) as score
      from rest_info a join rest_review b
      on a.rest_id = b.rest_id
      group by a.rest_id
    ) r join rest_info b
on r.rest_id = b.rest_id
where address like ('서울%')
order by score desc, favorites desc