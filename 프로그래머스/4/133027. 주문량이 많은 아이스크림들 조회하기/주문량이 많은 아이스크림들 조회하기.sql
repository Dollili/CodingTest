-- 코드를 입력하세요
select flavor
from (select flavor, sum(total_order) as total, row_number() over(order by sum(total_order) desc) as rn
      from (
        select flavor, total_order from first_half
        union all
        select flavor, total_order from july
      )
      group by flavor
      ) t
where t.rn <= 3