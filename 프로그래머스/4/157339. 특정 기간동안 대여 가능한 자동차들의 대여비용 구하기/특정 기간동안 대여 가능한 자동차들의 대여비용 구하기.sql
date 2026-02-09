-- 코드를 입력하세요

select a.car_id, a.car_type, a.daily_fee  * 30 * (100 - discount_rate) / 100.0 as fee
from CAR_RENTAL_COMPANY_CAR a 
join CAR_RENTAL_COMPANY_DISCOUNT_PLAN c on a.car_type = c.car_type and c.duration_type = '30일 이상'
where a.car_type in ('세단', 'SUV') 
and not exists (
    select 1
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY b                        
    where a.car_id = b.car_id 
    and start_date <= date '2022-11-30'
    and end_date   >= date '2022-11-01')
and a.daily_fee * 30 * (100 - discount_rate) / 100.0 >= 500000 
and a.daily_fee * 30 * (100 - discount_rate) / 100.0 < 2000000
order by fee desc, car_type, car_id desc