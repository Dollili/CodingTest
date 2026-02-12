-- 코드를 입력하세요
select 
extract(year from a.sales_date) as year,
extract(month from a.sales_date) as month,
count(distinct a.user_id) as purchased_users,
round((count(distinct a.user_id)/(select count(*)
       from user_info
       where to_char(joined, 'YYYY') = 2021)), 1) as puchased_ratio
from online_sale a join (select *
                  from user_info
                  where extract(year from joined) = 2021
                 ) b on a.user_id = b.user_id
group by extract(year from a.sales_date),
extract(month from a.sales_date)
order by year, month