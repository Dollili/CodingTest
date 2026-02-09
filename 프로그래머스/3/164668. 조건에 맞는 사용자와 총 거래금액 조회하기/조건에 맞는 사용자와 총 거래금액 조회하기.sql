-- 코드를 입력하세요
select user_id, nickname, total as total_sales
from (select writer_id, sum(price) as total
from used_goods_board
where status = 'DONE'
group by writer_id
having sum(price) >= 700000) a join used_goods_user b on a.writer_id = b.user_id
order by 3