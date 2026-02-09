-- 코드를 입력하세요
select  extract(month from start_date) as month, car_id, count(extract(month from start_date)) as records
from  CAR_RENTAL_COMPANY_RENTAL_HISTORY
where car_id in (
    select car_id
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY      
    where start_date >= date '2022-08-01' and start_date <= date '2022-10-31' 
    group by car_id
    having count(car_id) >= 5
)
and start_date >= date '2022-08-01' and start_date <= date '2022-10-31' 
group by car_id, extract(month from start_date)
order by month asc, car_id desc