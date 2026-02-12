-- 코드를 입력하세요
select user_id, nickname, city || ' ' || street_address1 || ' ' || street_address2 as 전체주소, 
regexp_replace(tlno, '(.{3})(.+)(.{4})', '\1-\2-\3')as 전화번호
from used_goods_user
where user_id in (SELECT writer_id
from used_goods_board
group by writer_id
having count(*) >= 3)
order by user_id desc;