-- 코드를 입력하세요
select flavor
from (select a.flavor, sum(tt + t) as total, row_number() over(order by sum(tt + t) desc) as rn
from (select  flavor, sum(total_order) as tt
      from first_half
     group by flavor) a, (
    select flavor, sum(total_order) as t
    from july 
    group by flavor       
    ) b
where a.flavor = b.flavor
group by a.flavor) t
where t.rn <= 3
